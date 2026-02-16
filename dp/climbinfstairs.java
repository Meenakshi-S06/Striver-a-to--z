import java.util.*;
public class climbinfstairs{
    public static int climb(int[]dp,int n){
        if(n<=2) return n;
        else if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=climb(dp,n-1)+climb(dp,n-2);
        return dp[n];

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int total= climb(dp,n);
        System.out.println(total);
    }
}