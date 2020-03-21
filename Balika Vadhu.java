import java.util.Scanner;

public class Main {

	static int lcs(String s1,String s2,int m,int n,int k,int[][][] dp){
       
        if(dp[m][n][k]<0){
            dp[m][n][k]=0;
        }
        //int res;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                for(int x=0;x<=k;x++){
                    if(x==0)
                        dp[i][j][x]=0;
                    else if(x>Math.min(i,j)){
                        dp[i][j][x]=Integer.MIN_VALUE;
                    }
                    else{
                        if(s1.charAt(i-1)==s2.charAt(j-1)){
                            int op1=s1.charAt(i-1)+dp[i-1][j-1][x-1];
                            int op2=Math.max(dp[i][j-1][x],dp[i-1][j][x]);
                            dp[i][j][x]=Math.max(op1,op2);
                            
                        }
                        else{
                            dp[i][j][x]=Math.max(dp[i-1][j][x],dp[i][j-1][x]);
                            
                        }
                    }
                    }
                }
            }
        if((int)dp[m][n][k]<0){
            dp[m][n][k]=0;
        }
        return dp[m][n][k];
        }
        
    
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String s1=sc.next();
            String s2=sc.next();
            int m=s1.length();
            int n=s2.length();
            int k=sc.nextInt();
            int[][][] dp=new int[102][102][102];
            
            
            System.out.println(lcs(s1,s2,m,n,k,dp));
                
            t--;
        }
    }

}
