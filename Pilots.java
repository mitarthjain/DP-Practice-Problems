import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
         Scanner sc=new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long [] dp = new long [n / 2 + 1];
        Arrays.fill (dp, 1l << 55); dp [0] = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            sum += b;
            int inc = a - b;
            dp [0] = 0;
            for (int j = (i + 1) / 2; j >= 1; j--)
                if (dp [j - 1] + inc < dp [j])
                    dp [j] = dp [j - 1] + inc;
        }
        
        System.out.println (dp [n / 2] + sum);

	}

}
