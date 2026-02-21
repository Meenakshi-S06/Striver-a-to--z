import java.util.*;
public class moveallzeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
        /*for(int i =0;i<n;i++){
            if(arr[i]==0){
                if(arr[k]!=0){
                    int temp = arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;                    
                }
                else{
                    while(k>i && arr[k]==0){
                        k--;
                    }
                    int temp = arr[k];
                    arr[k]=arr[i];
                    arr[i]=temp;
                }
            }
        }*/
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}