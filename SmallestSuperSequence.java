public class Solution {
    static int solve(String s1,String s2, int i,int j,int[][] dp){
        int m=s1.length();
        int n=s2.length();
        int ans=0;
        if(i>m-1){
            return n-j;
        }
        if(j>n-1){
            return m-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+solve(s1,s2,i+1,j+1,dp);
            
        }
        else{
            ans=Math.min(1+solve(s1,s2,i+1,j,dp),1+solve(s1,s2,i,j+1,dp));
            
        }
        dp[i][j]=ans;
        return ans;
        
    }

	public static int smallestSuperSequence(String s1, String s2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input. Input is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        
        }
        return solve(s1,s2,0,0,dp);
        
        

	}
}
