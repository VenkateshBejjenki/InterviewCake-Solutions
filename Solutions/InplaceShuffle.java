 /*-----------------------------------------------------------------------------------
 * <p> Title: Inplace Shuffle </p>
 *
 * <p> Description: A program that shuffles an array inplace. </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;

public class InplaceShuffle {

    private Random rand = new Random();

    private int getRandom(int floor, int ceiling) {
        return rand.nextInt((ceiling - floor) + 1) + floor;
    }

    public void shuffle(int[] theArray) {

        // for each index in the array
        for (int firstIndex = 0; firstIndex < theArray.length; firstIndex++) {

            // grab a random other index
            int secondIndex = getRandom(firstIndex, theArray.length - 1);

            // and swap the values
            if (secondIndex != firstIndex) {
                int temp = theArray[firstIndex];
                theArray[firstIndex] = theArray[secondIndex];
                theArray[secondIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,4,7,13,99};
        InplaceShuffle obj = new InplaceShuffle();
        obj.shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
}



