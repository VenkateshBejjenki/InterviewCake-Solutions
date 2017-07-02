/*-----------------------------------------------------------------------------------
 * <p> Title: Denomination. </p>
 *
 * <p> Description: A program to calculate the number of ways to make the amount of money with given coins </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * <p> Credits : Coin Change Problem by ONeill
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

class Denomination {
    public static void main(String[] args) {
        int denom[] = {1,2,3};
        int amount = 5;

        int arr[] = new int[amount+1];
        arr[0]=1;
        for (int i=0 ; i<denom.length; i++) {
            for (int j=1; j<arr.length ; j++ ) {

                if (j>=denom[i]) {

                    arr[j] = arr[j]+arr[j-denom[i]];
                }
            }
        }
        for (int k=0; k<arr.length; k++) {
            System.out.print("->"+arr[k]);
        }
        System.out.println("No of ways to make the amount of "+amount+" by given coins is "+arr[arr.length-1]);
    }
}