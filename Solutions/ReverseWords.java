 /*-----------------------------------------------------------------------------------
 * <p> Title: Reverse words </p>
 *
 * <p> Description: A program that reverses the words in a given string(Ex: Hi my name is Bejjenki -> Bejjenki is name my Hi) </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.util.*;
class ReverseWords {

    public String reverseWords(String input){
        String arr[] = input.split(" ");
        String temp;
        for (int i = 0; i < arr.length/2; i++ ) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        input = String.join(" ",arr);

        return input;

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();

        ReverseWords obj = new ReverseWords();

        System.out.println(obj.reverseWords(input));
    }
}