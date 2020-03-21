import java.util.*;
public class Solution {
    static int lcsSol(String s1,String s2,int m,int n,int[][] dp){
        if(m==0 || n==0){
            return 0;
        }
        if(dp[m][n]>-1){
            return dp[m][n];
        }
        int res;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            res=1+lcsSol(s1,s2,m-1,n-1,dp);
        }
        else{
            int op1=lcsSol(s1,s2,m,n-1,dp);
            int op2=lcsSol(s1,s2,m-1,n,dp);
            res=Math.max(op1,op2);
        }
        dp[m][n]=res;
        return res;
    }

	
	public static int lcs(String s1, String s2){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
     
	*/
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return lcsSol(s1,s2,m,n,dp);

	}

	
}
