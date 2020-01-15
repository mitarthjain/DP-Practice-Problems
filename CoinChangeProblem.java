
public class Solution {

	public static int coinChangeWays(int d[], int n){
		
     int m=d.length;
     int[] dp=new int[n+1];
     dp[0]=1;
     for(int i=0; i<m; i++) 
        for(int j=d[i]; j<=n; j++) 
            dp[j] += dp[j-d[i]]; 
  
    return dp[n];

	}
	
}
