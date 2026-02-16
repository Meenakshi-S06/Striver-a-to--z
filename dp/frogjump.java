import java.util.*;
public class frogjump{
    public static int jump(int[] arr,int[]dp,int n){
        if(n==0) return n;
        else if(dp[n]!=0){
            return dp[n];
        }
        
        int left = jump(arr,dp,n-1)+Math.abs(arr[n-1]-arr[n]);
        int right = Integer.MAX_VALUE;
        if(n>1) {
            right=jump(arr,dp,n-2)+Math.abs(arr[n-2]-arr[n]);
        }
        return dp[n]=Math.min(left,right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] dp = new int[n+1];
        int res = jump(arr,dp,n-1);
        System.out.println(res);
    }
}