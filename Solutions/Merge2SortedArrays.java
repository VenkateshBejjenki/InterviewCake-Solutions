 /*-----------------------------------------------------------------------------------
 * <p> Title: Merge two sorted arrays  </p>
 *
 * <p> Description: A program that return the merged array of two sorted arrays</p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.util.*;
public class Merge2SortedArrays {

    public int [] merge(int arr1[],int arr2[]){
        int i = 0;
        int j = 0;
        int result [] = new int [arr1.length+arr2.length];

        for (int k = 0; k < result.length; k++) {
            if (i<arr1.length && j<arr2.length) {

                if (arr1[i] < arr2[j]) {
                    result[k] = arr1[i];
                    i = i+1;
                    // i = i<arr1.length-1 ? i+1 : i;
                }
                else {
                    result[k] = arr2[j];
                    j = j+1;
                    // j = j < arr2.length-1 ? j+1 : j;
                }
            }
            else if (i<arr1.length) {
                    result[k] = arr1[i];
                    i = i+1;
            }else{
                    result[k] = arr2[j];
                    j = j+1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {2,5,8,19,33,47,54};
        int arr2[] = {4,6,10,15,23};
        Merge2SortedArrays obj = new Merge2SortedArrays();
        System.out.println("Merged array is"+Arrays.toString(obj.merge(arr1,arr2)));
    }
}