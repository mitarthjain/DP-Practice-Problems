import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int min_cost(int[][] a,int m,int n){
         int[][] dp=new int[m][n];
         dp[m-1][n-1]=a[m-1][n-1];
         for(int i=m-2;i>=0;i--){
             dp[i][n-1]=dp[i+1][n-1]+a[i][n-1];
         }
         for(int j=n-2;j>=0;j--){
             dp[m-1][j]=dp[m-1][j+1]+a[m-1][j];
         }
         for(int i=m-2;i>=0;i--){
             for(int j=n-2;j>=0;j--){
                 dp[i][j]=a[i][j]+Math.min(dp[i][j+1],Math.min(dp[i+1][j+1],dp[i+1][j]));
             }
         }
         int output=dp[0][0];
         return output;
     }
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int p=sc.nextInt();
	         int[][] ar=new int[p][p];
	         for(int i=0;i<p;i++){
	             for(int j=0;j<p;j++){
	                 ar[i][j]=sc.nextInt();
	             }
	         }
	         System.out.println(min_cost(ar,p,p));
	         t--;
	     }
	 }
}
