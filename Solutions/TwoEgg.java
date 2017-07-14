 /*-----------------------------------------------------------------------------------
 * <p> Title: Two Egg  </p>
 *
 * <p> Description: A program that returns the highest egg drops from floors without breaking ,given no of floors and eggs</p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;
public class TwoEgg {

    public int highestFloor(int floors, int eggs){
        int result;
        int eggArr[][] = new int[eggs+1][floors+1];
        for (int i=1; i<=floors; i++) {
            eggArr[1][i]=i;
        }

        for (int j = 1; j<=eggs; j++) {
            eggArr[j][1]=1;
        }

        for (int i = 2; i<=eggs ; i++ ) {
            for (int j=2;j<=floors ;j++ ) {

                eggArr[i][j] = Integer.MAX_VALUE;
                for (int k =1; k<=j; k++) {
                    result = 1+Math.max(eggArr[i-1][k-1],eggArr[i][j-k]);
                    if (result<eggArr[i][j]) {
                        eggArr[i][j] = result;
                    }

                }
            }
        }
        return eggArr[eggs][floors];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter no of Floors : ");
        int floors = sc.nextInt();
        System.out.println("Enter no of Eggs : ");
        int eggs = sc.nextInt();

        TwoEgg obj = new TwoEgg();

        System.out.println("The highest egg drops from floors without breaking is : "+obj.highestFloor(floors,eggs));

    }
}