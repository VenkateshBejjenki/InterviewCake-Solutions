/*-----------------------------------------------------------------------------------
 * <p> Title: HiCal </p>
 *
 * <p> Description: A program to merge the meeting times (an addition of the calender application)</p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/


import java.util.*;
import java.io.*;
class Meeting implements Comparable<Meeting>{

    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


    @Override
    public int compareTo(Meeting m){
        if (this.getStartTime() == m.getStartTime()) {
            return 0;
        }
        else if (this.getStartTime() > m.getStartTime() ){
            return 1;
        }
        else {
            return -1;
        }

    }
    @Override
    public String toString(){
        return "("+getStartTime()+","+getEndTime()+")";
    }
}
public class HiCal {

    public ArrayList<Meeting> mergeMeeting(ArrayList<Meeting> al){
        ArrayList<Meeting> result = new ArrayList<Meeting>();
        for (int i=0;i<al.size()-1 ;i++) {
            if(al.get(i).getEndTime() >=al.get(i+1).getStartTime()){

                if(al.get(i).getEndTime()>=al.get(i+1).getEndTime()){
                    al.get(i+1).setStartTime(al.get(i).getStartTime());
                    al.get(i+1).setEndTime(al.get(i).getEndTime());

                }
                else {
                    al.get(i+1).setStartTime(al.get(i).getStartTime());
                }

                al.get(i).setStartTime(Integer.MIN_VALUE);
                al.get(i).setEndTime(Integer.MIN_VALUE);

            }

        }
        for (int i =0; i<al.size(); i++) {
            if(al.get(i).getStartTime()!=Integer.MIN_VALUE){
                result.add(new Meeting( al.get(i).getStartTime(),al.get(i).getEndTime() ));
            }
            else continue;
        }

        return result;
    }


    public static void main(String[] args) {

        ArrayList<Meeting> al = new ArrayList<Meeting>();
        // Test case 1

        // al.add(new Meeting(0,1));
        // al.add(new Meeting(3,5));
        // al.add(new Meeting(4,8));
        // al.add(new Meeting(10,12));
        // al.add(new Meeting(9,10));

        // Test case 2

        // al.add(new Meeting(1,2));
        // al.add(new Meeting(2,3));

        // Test case 3

        // al.add(new Meeting(1,5));
        // al.add(new Meeting(2,3));

        // Test case 4

        al.add(new Meeting(1,10));
        al.add(new Meeting(2,6));
        al.add(new Meeting(3,5));
        al.add(new Meeting(7,9));



        Collections.sort(al);
        System.out.println(al);
        HiCal result = new HiCal();
        System.out.println("After Merging Meetings : "+result.mergeMeeting(al));


    }

}
