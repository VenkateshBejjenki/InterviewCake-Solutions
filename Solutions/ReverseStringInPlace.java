 /*-----------------------------------------------------------------------------------
 * <p> Title: Reverse String </p>
 *
 * <p> Description: A program that reverses the given string(Ex: Helloworld => dlrowolleH) </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/


import java.util.*;
class ReverseStringInPlace {

    public String reverseString(String input){
        char arr[] = input.toCharArray();
        char temp;
        for (int i = 0; i < arr.length/2; i++ ) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        input = String.valueOf(arr);

        return input;

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();

        ReverseStringInPlace obj = new ReverseStringInPlace();

        System.out.println(obj.reverseString(input));
    }
}