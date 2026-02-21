import java.util.*;
public class longestsubstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       //Brute Force
        /*int[] hash = new int[256];
        int maxlen =0;
        int len=0;
        for(int i =0;i<s.length();i++){
        for(int j =1;i<s.length();j++){
            if(hash[s.charAt(j)]==1) break;
            len=j-i+1;
            maxlen=Math.max(len,maxlen);
            hash[s.charAt(j)]=1;
        }
    }
        System.out.println(maxlen);*/
        int left = 0;
        int maxlen =0;
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int right =0;right<s.length();right++){
            if(!hp.containsKey(s.charAt(right))){
                hp.put(s.charAt(right),right);
                maxlen=Math.max(maxlen,right-left+1);
            }
            else{
                left=Math.max(left,hp.get(s.charAt(right))+1);
                //maxlen=Math.max(maxlen,right-left+1);
            }
        }
        System.out.println(maxlen);

    }
}