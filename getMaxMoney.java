
public class Solution {
	public static int getMaxMoney(int arr[], int n){
        int[] dp=new int[n];
        dp[0]=arr[0];
        dp[1]=arr[1];
        for(int i=2;i<n;i++){
            for(int j=i-2;j>=0;j--){
                
                int sum=arr[i]+dp[j];
                if(sum>dp[i])
                    dp[i]=sum;
                
            }
            
        }
        int output=0;
        for(int x=0;x<n;x++){
            if(output<dp[x]){
                output=dp[x];
            }
        }
        return output;

	}
}
