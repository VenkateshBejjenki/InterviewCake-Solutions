 /*-----------------------------------------------------------------------------------
 * <p> Title: Find Duplicate Files  </p>
 *
 * <p> Description: A program that returns list of Duplicate and orginal file path tuples </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.*;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

class FilePaths {

    private Path duplicatePath;
    private Path originalPath;

    public FilePaths(Path duplicatePath, Path originalPath) {
        this.duplicatePath = duplicatePath;
        this.originalPath  = originalPath;
    }

    public Path getDuplicatePath() {
        return duplicatePath;
    }

    public Path getOriginalPath() {
        return originalPath;
    }

    @Override
    public String toString() {
        return String.format("(duplicate: %s, original: %s)", duplicatePath, originalPath);
    }
}

public class FindDuplicateFiles {

    ArrayList<FilePaths> al = new ArrayList<>();
    HashMap<String,String> hash = new HashMap<>();
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


    private static String getFileChecksum(MessageDigest digest, File file) throws IOException {
        //Get file input stream for reading the file content
        FileInputStream fis = new FileInputStream(file);

        //Create byte array to read data in chunks
        byte[] byteArray = new byte[1024];
        int bytesCount = 0;

        //Read file data and update in message digest
        while ((bytesCount = fis.read(byteArray)) != -1) {
            digest.update(byteArray, 0, bytesCount);
        };

        //close the stream; We don't need it now.
        fis.close();

        //Get the hash's bytes
        byte[] bytes = digest.digest();

        //This bytes[] has bytes in decimal format;
        //Convert it to hexadecimal format
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        //return complete hash
       return sb.toString();
    }



    public void findDuplicates( String directoryName) throws NoSuchAlgorithmException , IOException{
        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
         for (File file : fList){
            if (file.isFile()){
                // System.out.println(file.getAbsolutePath());
                    String temp = getFileChecksum(md5Digest, file);
                if (hash.get(temp)!=null) {
                    String val = hash.get(temp);

                    File file1 = new File(val);
                    Date date1 = new Date(file1.lastModified());
                    Date date2 = new Date(file.lastModified());

                    if (date1.compareTo(date2)>0) {
                        FilePaths ob = new FilePaths(file1.toPath(),file.toPath());
                        al.add(ob);
                    }
                    else{
                        FilePaths ob = new FilePaths(file.toPath(),file1.toPath());
                        al.add(ob);

                    }

                }
                else{
                    hash.put(getFileChecksum(md5Digest, file),file.getAbsolutePath());

                }

            } else if (file.isDirectory()){
                findDuplicates(file.getAbsolutePath());
            }
        }


    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        FindDuplicateFiles obj = new FindDuplicateFiles();

        try{
            // Give any directory
            obj.findDuplicates("dub/");

        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(obj.al);


    }
}