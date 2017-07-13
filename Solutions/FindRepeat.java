 /*-----------------------------------------------------------------------------------
 * <p> Title: Appears Twice  </p>
 *
 * <p> Description: A program that returns the dublicate no in the given array. (Without disturbing the input array).</p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;
public class FindRepeat {

    //Complexity : Time- O(nlogn)
    public Integer findDoulicate(int arr[]){

        int low = 1;
        int high = arr.length-1;

        while(low<high){
            int mid = low+(high-low)/2;
            int lowerRangeLowerBound = low;
            int lowerRangeUpperBound = mid;
            int upperRangeLowerBound = mid+1;
            int upperRangeUpperBound = high;

            int elementsInLowerRange = 0;
            int distinctElementsInLowerRange = lowerRangeUpperBound - lowerRangeLowerBound + 1;

            for (int i =0; i<arr.length; i++) {
                if (arr[i] >= lowerRangeLowerBound && arr[i] <= lowerRangeUpperBound) {
                    elementsInLowerRange+=1;
                }
            }

            if (distinctElementsInLowerRange < elementsInLowerRange) {
                high = lowerRangeUpperBound;
            }
            else{
                low = upperRangeLowerBound;
            }

        }

        return low;
    }

    public static void main(String[] args) {
        FindRepeat obj = new FindRepeat();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n value");
        int n = 5;
        int arr[] = {1,2,5,3,4,5};
        // int n = sc.nextInt();
        // int arr[] = new int[n+1];
        // for (int i=0; i<=n ; i++ ) {
        //     arr[i]=r.nextInt(n)+1;
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(obj.binarySearch(arr,0,arr.length-1,0));
        System.out.println(obj.findDoulicate(arr));
    }
}
