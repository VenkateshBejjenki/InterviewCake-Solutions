/*-----------------------------------------------------------------------------------
 * <p> Title: AppleStock Class. </p>
 *
 * <p> Description: A program to calculate the max profit of previous day's stock prize </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

class AppleStock{

	public static int getMaxProfit(int[] arr){


		int m=arr[0];
		int maxProfit=arr[1]-arr[0];
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				//System.out.println(arr[j]-arr[i]);
				if(maxProfit<(arr[j]-arr[i])){
					maxProfit=arr[j]-arr[i];
				}
			}
		}

		return (maxProfit);
	}

	public static int getMax(int [] ar){
		int max=ar[ar.length-1]-ar[ar.length-2];
		int x=max;
		int z;
		for(int i=ar.length-2;i>0;i--){
			int y=ar[i]-ar[i-1];
			if(x+y<y){
				z=y;
			}else
				z=x+y;
			x=z;
				if(max<x)
					max=x;

		}
		return max;
	}

	public static void main(String[] args) {
		int[] stockPricesYesterday = {10, 7, 5, 8, 11, 9};
		int[] case1={1,2,3,4};
		int[] case2={100, 200, 300, 200, 100, 50, 200, 500};
		int[] case3={4, 3, 2, 1};
		int[] case4={100,200,300,200,100,50};

		System.out.println("Complexity n^2");

		System.out.println(getMaxProfit(stockPricesYesterday));
		System.out.println(getMaxProfit(case1));
		System.out.println(getMaxProfit(case2));
		System.out.println(getMaxProfit(case3));
		System.out.println(getMaxProfit(case4));

		System.out.println("Complexity n");

		System.out.println(getMax(stockPricesYesterday));
		System.out.println(getMax(case1));
		System.out.println(getMax(case2));
		System.out.println(getMax(case3));
		System.out.println(getMax(case4));


	}
}