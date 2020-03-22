
public class Solution {
	
	
	static int kS(int W,int[] wt,int[] val,int n){
        int[] sP=new int[W+1];
        int[] sC=new int[W+1];
        for(int i=1;i<val.length+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]>j){
                    sC[j]=sP[j];
                }
                else{
                    sC[j]=Math.max(sP[j-wt[i-1]]+val[i-1],sP[j]);
                }
            }
            sP=sC;
            sC=new int[W+1];
            
        }
        return sP[W];
        // if(n==0 || W==0){
        //     return 0;
        // }
        // if(wt[n-1]>W){
        //     return kS(W,wt,val,n-1);
        // }
        // else{
        //     int op1=val[n-1]+kS(W-wt[n-1],wt,val,n-1);
        //     int op2=kS(W,wt,val,n-1);
        //     return Math.max(op1,op2);
        // // }
        // int[][] k=new int[n+1][W+1];
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=W;j++){
        //         if(i==0||j==0){
        //             k[i][j]=0;
        //         }
        //         else if(wt[i-1]<=j){
        //             k[i][j]=Math.max(val[i-1]+k[i-1][j-wt[i-1]],k[i-1][j]);
        //         }
        //         else{
        //             k[i][j]=k[i-1][j];
        //         }
        //     }
        // }
        // return k[n][W];
    }
	public static int knapsack(int[] wt,int val[],int W){

	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
     
	 */
        
        int n=wt.length;
        return kS(W,wt,val,n);
        
    
		
	}
	
}
