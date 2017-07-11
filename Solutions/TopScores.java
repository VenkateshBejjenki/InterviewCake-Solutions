 /*-----------------------------------------------------------------------------------
 * <p> Title: Top Scores </p>
 *
 * <p> Description: A program that sorts the given scores in decending order in time complexity O(n). </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
public class TopScores {

    public void sort(int [] scores,int maxScorePossible){
        int sortingArray[] = new int [maxScorePossible+1];
        for (int score : scores) {
            sortingArray[score]++;
        }
        int k=0;
        for (int i=maxScorePossible; i>=0; i--) {
            int s = sortingArray[i];
            for (int j = s;j>=1 ;j-- ) {
                scores[k++]=i;
            }
        }

    }


    public static void main(String[] args) {
        int scores[] = {37, 89, 41, 65, 91, 53};
        int maxScorePossible = 100;
        TopScores obj = new TopScores();
        obj.sort(scores,maxScorePossible);
        for (int ele : scores) {
            System.out.println(ele);
        }
    }
}