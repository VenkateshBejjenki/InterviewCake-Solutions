/*-----------------------------------------------------------------------------------
 * <p> Title: Find in Ordered Set. </p>
 *
 * <p> Description: A program that check whether the given integer is in the given ordered set </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/



import java.util.*;
public class FindIntInList {
    public boolean binarySearch(int arr[],int item){
        return search(arr,0,arr.length-1,item);
    }

    public boolean search(int arr[],int low,int high,int item){
        int mid;
        // System.out.println("low="+low+" high="+high);
        while(low<=high){
            mid = (high+low)/2;
            if (arr[mid]==item) {
                return true;
            }

            if(arr[mid]>item){
                high=mid-1;
            }
            else {
                low = mid+1;
            }

        }

        return false;
    }


    public static void main(String[] args) {
        // int arr[] = {-1,0,4,6,8,13,55,199,233,2333};
        int arr[]={1,2,3,4,5};
        int item = -1;
        FindIntInList obj = new FindIntInList();
        System.out.println(obj.binarySearch(arr,item));
    }

}