 /*-----------------------------------------------------------------------------------
 * <p> Title: Appears Twice  </p>
 *
 * <p> Description: A program that returns the element that appears twice in a array with elements ranging from 0 to n </p>
 *
 * <p> Copyleft: Venkatesh Bejjenki 2017 </p
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
public class AppearsTwice {

    public int appearedTwice(int []arr,int n){
        int sum = (n*(n+1))/2;
        int arrSum = 0;
        for (int i : arr) {
            arrSum+=i;
        }
        return arrSum-sum;
    }
    public static void main(String[] args) {
        int n = 10;
        //given n+1 array arr[11];
        int [] arr = {1,3,2,3,4,6,5,8,9,7,10};
        AppearsTwice obj = new AppearsTwice();
        System.out.println("Element that appeared twice is : "+obj.appearedTwice(arr,n));
    }
}
