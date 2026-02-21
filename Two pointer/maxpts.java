import java.util.*;
public class maxpts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int sum=0;
        int maxsum =0;
        int lsum =0;
        int rsum =0;
        for(int i =0;i<k;i++){
            lsum+=arr[i];
        }
        for(int i =1;i<=k;i++){
            sum=lsum+rsum;
            maxsum=Math.max(maxsum,sum);
            lsum-=arr[k-i];
            rsum+=arr[n-i];
        }
        System.out.println(maxsum);
        
    }
}