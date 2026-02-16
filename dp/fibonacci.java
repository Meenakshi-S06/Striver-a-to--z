import java.util.*;
public class fibonacci{
    public static int fibo(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fibo((n-1),dp)+fibo((n-2),dp);
      
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Memoization
        int[] dp = new int[n+1];
        System.out.println(fibo(n,dp));


        // Tabulation

        /*int[] dp = new dp[n+1] ;
        dp[0]=0;
        dp[1]=1;
        for(int i =2;i<=n;i++){
        dp[i]=dp[i-1]+ dp[i-2];
        }
        return dp[n];
        */

        // space saving

        /* int prev2 = 0,prev=1;
        for(int i =2;i<=n;i++) {
        curri=prev2+prev;
        return prev*/
    }
}