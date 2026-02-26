import java.util.*;
public class maxconsecutive {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        //int left =0;
        int maxlen =0;
        int zeroes=0;
        // Better solution
        /*for(int right =0;right<n;right++){
            if(arr[right]==0){
                zeroes++;
                while(zeroes>k){
                    if(arr[left]==0){
                        zeroes--;
                    }
                    left++;
                }
                    
            }
            maxlen = Math.max(maxlen,right-left+1);
            
        }*/
       // Optimized Approach:
       int left = 0, right = 0;
       while(right<n){
        if(arr[right]==0){
            k--;
        }
        if(k<0){
            if(arr[left]==0){
                k++;
            }
            left++;
        }
        maxlen=Math.max(maxlen,right-left+1);
        right++;
       }
        System.out.println(maxlen);
    }
}
