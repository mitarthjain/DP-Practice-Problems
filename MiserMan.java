import java.util.Scanner;

public class Main {
  

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                
            }
        }
        int[][] c=new int[n][m];
        for(int i=0;i<m;i++)
            c[n-1][i]=a[n-1][i];
        for(int i=n-2;i>=0;i--){
            c[i][0]=a[i][0]+Math.min(c[i+1][0],c[i+1][1]);
            c[i][m-1]=a[i][m-1]+Math.min(c[i+1][m-1],c[i+1][m-2]);
            for(int j=1;j<m-1;j++){
                c[i][j]=a[i][j]+Math.min(c[i+1][j-1],Math.min(c[i+1][j],c[i+1][j+1]));
            }
      }
    int k=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            k=Math.min(k,c[0][i]);
        }
        System.out.println(k);
        
        

	}

}
/*
5 5
1  3  1  2  6
10 2  5  4  15
10 9  6  7  1
2  7  1  5  3
8  2  6  1  9
*/
