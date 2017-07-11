 /*-----------------------------------------------------------------------------------
 * <p> Title: Recursive String Permutations </p>
 *
 * <p> Description: A program that generates all possible permutations of a string. </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.util.*;

public class RecursiveStringPermutations {

    Set <String> set = new HashSet<String>();


    public Set<String> stringPermutations(String prefix, String s){
        int n = s.length();
        if (n==0) {
            set.add(prefix);
        }
        else {
            for (int i=0; i<n; i++) {
                stringPermutations(prefix+s.charAt(i), s.substring(0,i) + s.substring(i+1,n));
            }
        }

        return set;
    }

    public Set<String> generatePermutations(String s){
        return stringPermutations("",s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();
        System.out.println("String Permutaions are : ");
        Set <String> set = new HashSet<String>();
        RecursiveStringPermutations obj = new RecursiveStringPermutations();
        set=obj.generatePermutations(input);
        set.forEach(System.out::println);
    }

}