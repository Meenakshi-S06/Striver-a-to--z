import java.util.*;
public class removeoccurance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele = sc.nextInt();
        /*
        int count=0;
        for(int i =0;i<n;i++){
            if(arr[i]!=ele){
                count++;
            }
        }
        System.out.println(count);
        */
       int k =0;
       for(int i =0;i<n;i++){
        if(arr[i]!=ele){
            arr[k]=arr[i];
            k++;
        }
       }
       System.out.println(k);
    }
}