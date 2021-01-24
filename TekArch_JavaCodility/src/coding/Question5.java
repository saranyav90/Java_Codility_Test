package coding;
/*
 * 5. Write a program to read monetary amount in cents and print the smallest possible number of coins equaling the amount. 
 * Example: monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies 
 * So smallest possible number of coins equaling the amount 283====9 coins
 * 
 */

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] =  {25, 10, 5};
		int m = coins.length;
		int V=70;
		
		System.out.println("Minimum coins required is "+ findMinCoins(coins, m, V) );
	}

	 static int findMinCoins(int[] coins, int m, int V) {
		// TODO Auto-generated method stub
		 if(V==0)
			 return 0;
		// Initialize result
		 int res=Integer.MAX_VALUE;
		 
		 // Try every coin that has smaller value than V
		 for(int i=0;i<m;i++) {
			 if(coins[i]<=V) {
				 int sub_res=findMinCoins(coins,m,V-coins[i]);
				// Check for INT_MAX to avoid overflow and see if result can minimized
				 if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
		                res = sub_res + 1;
			 }
		 }
		 return res;
	}

}
