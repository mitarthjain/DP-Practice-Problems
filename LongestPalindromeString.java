import java.util.Scanner;

class GFG {
  static String lps(String s) {
    if(s.isEmpty()) {
      return "";
    }
    int n = s.length();
    int longest = 0, si = 0, ei = 0;
    boolean[][] dp = new boolean[n][n];
  
    for(int i = 0; i < n; i++) {
      dp[i][i] = true;
      for(int j = 0; j < i; j++) {
        if(s.charAt(j) == s.charAt(i) && (i-j <= 2 || dp[j+1][i-1])) {
          dp[j][i] = true;
          if(i-j+1 > longest) {
            longest = i-j+1;
            si = j;
            ei = i;
          }  
        }
      }
    }
    return s.substring(si, ei+1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
    String s = sc.next();
    System.out.println(lps(s));
    t--;    
    }
  }
}
*********************************************************************************************************

To find length of that string

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int lps(String s){
        int n=s.length();
        int i,j,c;
        int[][] L=new int[n][n];
        for(i=0;i<n;i++)
            L[i][i]=1;
            for(c=2;c<=n;c++){
                for(i=0;i<n-c+1;i++){
                    j=i+c-1;
                    if(s.charAt(i)==s.charAt(j) && c==2)
                        L[i][j]=2;
                    
                    else if(s.charAt(i)==s.charAt(j))
                        L[i][j]=L[i+1][j-1]+2;
                    
                    else
                        L[i][j]=Math.max(L[i][j-1],L[i+1][j]);
                    
                }
                
            }
        return L[0][n-1];
    }
            
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         String s=sc.next();
	         System.out.println(lps(s));
	         t--;
	     }
	     
	 }
}
