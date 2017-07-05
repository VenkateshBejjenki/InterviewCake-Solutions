/*-----------------------------------------------------------------------------------
 * <p> Title: Missing Drone | Odd element in the given list </p>
 *
 * <p> Description: A program that returns a element which has appeared only once while other all elements have occured twice in a given list </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/


public class MissingDrone {


    // Complexity O(n).
    public int findDroneMissed(int [] droneIds){
        int x=0;
        for (int i =0 ; i< droneIds.length;i++ ) {
            //Performing XOR operation so that the element which has occured twice gets cancelled out.
            x = x ^ droneIds[i];
        }

        return x;
    }

    public static void main(String[] args) {
        int[] droneIds = {1,2,1};
        MissingDrone obj = new MissingDrone();
        System.out.println(obj.findDroneMissed(droneIds));

    }
}