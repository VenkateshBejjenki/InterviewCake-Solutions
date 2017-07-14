 /*-----------------------------------------------------------------------------------
 * <p> Title: Find Repeat Beast Mode </p>
 *
 * <p> Description: A program that returns the dublicate no in the given array.</p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.util.*;
public class FindRepeatBeast {

    public int findDublicate(int arr[]){

        // Complexity Time O(n)+O(n)
        int repeate = Integer.MIN_VALUE;

        for (int i =0; i<arr.length; i++) {
            if (arr[Math.abs(arr[i])]>=0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else {
                repeate = i;
            }
        }
        for (int i=0; i<arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }

        return arr[repeate];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};

        FindRepeatBeast obj = new FindRepeatBeast();
        System.out.println("Dublcate element is : "+ obj.findDublicate(arr));
    }
}