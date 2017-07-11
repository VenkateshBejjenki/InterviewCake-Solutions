 /*-----------------------------------------------------------------------------------
 * <p> Title: Bracket Validator </p>
 *
 * <p> Description: A program that checks whether the given string has palindrome for any of its permutations </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.util.*;

class PermutationPalindrome {

    public boolean checkPermutation(String input){
        int alpha[] = new int[26];
        int oddCharacter = 0;
        for (int i = 0; i<input.length(); i++) {
            // int index = input.charAt(i);
            alpha[((int)input.charAt(i))-97]++;
        }

        for (int i=0; i<alpha.length; i++) {
            if(alpha[i]%2!=0){
                oddCharacter++;
            }
        }

        if (oddCharacter>1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();

        PermutationPalindrome obj = new PermutationPalindrome();
        System.out.println("Is given string has permutation palindrome : "+obj.checkPermutation(input));
    }
}