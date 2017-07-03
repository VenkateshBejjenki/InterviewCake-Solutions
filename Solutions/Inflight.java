/*-----------------------------------------------------------------------------------
 * <p> Title: Inflight Entertainment | Two Sum </p>
 *
 * <p> Description: A program that checks whether there are any two numbers whoes sum is equal to the given number </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/


import java.util.*;
public class Inflight {

    public boolean findMovies(int flight_time, int [] movie){

        Hashtable<Integer,Integer> hash = new Hashtable<>();

        for (int i=0; i<movie.length; i++) {

            if(hash.get(flight_time-movie[i])==null){
                hash.put(movie[i],1);
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int flight_time = 34;
        //Test case 1
        int[] movie_lengths = {10,3,24,20,12,40,12,30};
        //Test case 2
        // int[] movie_lengths = {10,3,20,12,40,30};

        Inflight inf = new Inflight();
        System.out.println("Can we have two movies : "+inf.findMovies(flight_time,movie_lengths));
    }
}