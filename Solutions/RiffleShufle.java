 /*-----------------------------------------------------------------------------------
 * <p> Title: Riffle Shuffle </p>
 *
 * <p> Description: A program to check whether the given shuffled array was done from one riffle of two half packs. </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;

public class RiffleShufle {

    public boolean riffleShuffle(int [] deck,int half1[],int half2[]){
        int top1=0;
        int top2=0;
        int decktop=0;

        for (int i=0; i<deck.length; i++) {
            if (deck[i]==half1[top1]) {
                top1++;
            }
            else if (deck[i]==half2[top2]) {
                top2++;
            }
            else return false;
        }

        return true;

    }

    public static void main(String[] args) {
        int deck[] = {5,9,2,7,6,1,3,4};
        int half1[] = {9,2,7,4};
        int half2[] = {5,6,1,3};

        RiffleShufle obj = new RiffleShufle();
        System.out.println(obj.riffleShuffle(deck,half1,half2));
    }
}