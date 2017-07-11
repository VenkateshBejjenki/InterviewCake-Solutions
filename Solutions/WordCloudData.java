 /*-----------------------------------------------------------------------------------
 * <p> Title: Word Cloud Data </p>
 *
 * <p> Description: A program that builds a word cloud for the given string. </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;
public class WordCloudData {

    public HashMap<String,Integer> generateCloud(String input){
        HashMap<String,Integer> hash = new HashMap<>();
        String word="";
        for (int i = 0;i<input.length() ;i++ ) {
            if (( input.charAt(i)=='"' || input.charAt(i)== '\'' || input.charAt(i)=='('|| input.charAt(i)==')'|| input.charAt(i)==',' || input.charAt(i)=='.'|| input.charAt(i)==':' || input.charAt(i)==' ')) {

                if (word!="" && hash.get(word)==null) {
                    hash.put(word,1);

                }
                else if(word!=""){
                    int temp = hash.get(word);
                    hash.put(word,++temp);
                }

                word="";
            }
            else {
                word+=input.charAt(i);
            }
        }

        if (word!="" && hash.get(word)==null ) {
                    hash.put(word,1);

        }
        else if(word!="") {
            int temp = hash.get(word);
            hash.put(word,++temp);
        }

        return hash;


    }

    // Using regular expressions

    public HashMap<String, Integer> generateCloud1(String input){
        HashMap<String, Integer> hash = new HashMap<>();
        String[] uniqueWords = input.split("\\s|(\\.)|(\\')|(\")|(\\,)|(\\()|(\\))|(\\:)");
        for (String word : uniqueWords) {
            // System.out.println("-"+word+"-");
            if (!word.equals("") && hash.get(word)==null ) {
                    hash.put(word,1);

             }
            else if(!word.equals("")) {
                int temp = hash.get(word);
                hash.put(word,++temp);
            }
        }

        return hash;
       // System.out.println(Arrays.toString(uniqueWords));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        WordCloudData obj = new WordCloudData();
        HashMap<String,Integer> hash = obj.generateCloud(input);

        // Using regular expressions
        // HashMap<String,Integer> hash = obj.generateCloud1(input);



        for(HashMap.Entry<String, Integer> entry:hash.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+" : "+value);

        }
}
}