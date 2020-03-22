import java.util.Scanner;

public class Main {

	static boolean subSum(int[] val,int n,int sum){
        boolean[][] dp=new boolean[sum+1][n+1];
        for(int i=0;i<=sum;i++){
            dp[i][0]=false;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=true;
        }
        for (int i = 1; i <= sum; i++) 
        { 
            for (int j = 1; j <= n; j++) 
            { 
                    dp[i][j] = dp[i][j-1]; 
                if (i >= val[j-1]) 
                dp[i][j] = dp[i][j] ||  
                     dp[i - val[j-1]][j-1]; 
            } 
        } 
        return dp[sum][n];
        
    }
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
            
        }
        int sum=sc.nextInt();
        if(subSum(val,n,sum)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

	}

}
