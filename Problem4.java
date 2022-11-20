import java.util.*;

public class Problem4 {
  public static int minDifference(int[] a, int n) {
        int sum=0;
        for(int i:a) sum+=i;
        
        int k=sum;
        boolean[][] dp  = new boolean[n][k+1];
       
         for(int i=0;i<n;i++) dp[i][0] = true;
        if(a[0]<=k) dp[0][a[0]]=true;
        for(int i=1;i<n;i++){
            for(int j=1;j<=k;j++){
                boolean not = dp[i-1][j];
                boolean take=false;
                if(a[i]<=j) take = dp[i-1][j-a[i]];
                dp[i][j]=not|take;
            }
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=sum/2;i++){
            if(dp[n-1][i]==true){
                int s1 = i;
                int s2 = sum-i;
                min = Math.min(min,Math.abs(s2-s1));
            }
        }
        return min;
	}
    public static void main(String[] args) {
      int arr[]={3,45,3,100,1,83,54,23,20};
      int n=arr.length;
      System.out.println("Minimum difference is: "+minDifference(arr,n));
  }
}