/*-----------------------------------------------------------------------------------
 * <p> Title: Temperature Tracker. </p>
 *
 * <p> Description: A program that keeps track of temperatures </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;
class Temperature {
    // ArrayList<Integer> temp = new ArrayList<Integer>();
    Integer size=0;
    Integer sum=0;
    Integer max=Integer.MIN_VALUE;
    Integer min=Integer.MAX_VALUE;
    Integer forMode=0;
    int FahrenheitScale[] = new int[111];

    public void insert(Integer t){
        if(t>=0){
            // temp.add(t);
            process(t);
            size++;
        }
    }

    public void process(Integer t){
        sum = sum+t;
        if (max<t) {
            max=t;
        }
        if (min>t) {
            min=t;
        }
        FahrenheitScale[t]++;
        if(FahrenheitScale[t]>FahrenheitScale[forMode]){
            forMode=t;
        }

    }

    public Integer checkEmpty(){

        if(size==0){
            System.out.println("Record Empty");
            return 0;
        }
        else return size;
    }
    public Integer get_max(){

        if(checkEmpty()>0)
            return max;
        else return null;
    }

    public Integer get_min(){
        if (checkEmpty()>0) {
            return min;
        }
        else return null;
    }

    public float get_mean(){
        if (checkEmpty()>0) {
            return (float)sum/size;
        }
        else return 0;

    }
    public Integer get_mode(){
        if (checkEmpty()>0) {
            return forMode;

        }
        else return null;

    }

    public static void main(String[] args) {
        Temperature obj = new Temperature();

        obj.insert(75);
        obj.insert(7);
        obj.insert(5);
        obj.insert(2);

        System.out.println(obj.get_max());
        System.out.println(obj.get_min());
        System.out.println(obj.get_mode());
        System.out.println(obj.get_mean());



    }
}