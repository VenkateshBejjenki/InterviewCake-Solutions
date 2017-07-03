/*-----------------------------------------------------------------------------------
 * <p> Title: Rotation Point </p>
 *
 * <p> Description: A program that return the rotation point in the given list of dictionary words </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/



class RotationPoint {

    public int rotatePoint(String[] words){
        if (words.length==0) {
            return -1;
        }
        String pivot = words[0];
        int low = 0;
        int high = words.length-1;
        int mid;
        while(low <= high){

            mid = (low+high)/2;
            //To check current mid word with the pivot if >1 means the rotation point is in above half
            if (pivot.compareTo(words[mid])>=1) {
                // if above word(mid-1 index) is greater than mid word then mid is rotation point
                if (words[mid].compareTo(words[mid-1]) <= -1) {
                    return mid;
                }
                high = mid-1;
            }
            //else rotation is in below half
            else {
                low = mid+1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        String[] words = new String[]{
                            "ptolemaic",
                            "retrograde",
                            "supplant",
                            "undulate",
                            "xenoepist","xenoepistw","xenoepistx","xenoepisty",
                            "asymptote", // <-- rotates here!
                            "babka",
                            "banoffee",
                            "engender",
                            "karpatka",
                            "othellolagkage",
                        };

        String[] words2 = new String[]{"abc","abc","abc"};

        RotationPoint r = new RotationPoint();
        System.out.println(r.rotatePoint(words));
        System.out.println(r.rotatePoint(words2));

    }
}