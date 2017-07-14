 /*-----------------------------------------------------------------------------------
 * <p> Title: Simulate 7-sided die  </p>
 *
 * <p> Description: A program that returns the random no in range of [1,7] using random of 5 </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;
public class Rand7sidedDie {

    public int rand5(Random r){
        int randNo = ((r.nextInt(5))*5)+(r.nextInt(5))+1;
        return (randNo <=21) ? randNo : rand5(r);
    }

    public int rand7(Random r){
        return (rand5(r)%7)+1;
    }


    public static void main(String[] args) {
        Rand7sidedDie obj =new Rand7sidedDie();
        Random r = new Random();

        System.out.println(obj.rand7(r));

    }
}