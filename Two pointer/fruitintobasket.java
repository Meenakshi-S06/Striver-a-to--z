import java.util.*;
public class fruitintobasket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hp = new HashMap<>();
        int left = 0;
        int maxlen =0;
        for(int right =0;right<n;right++){
            hp.put(arr[right],hp.getOrDefault(arr[right], 0)+1);
            while(hp.size()>2){
                hp.put(arr[left],hp.get(arr[left])-1);
                if(hp.get(arr[left])==0){
                    hp.remove(arr[left]);
                }
                left++;
            }
            maxlen =Math.max(right-left+1,maxlen);


        }
        System.out.println(maxlen);

    }
}