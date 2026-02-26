import java.util.*;
public class longest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] str1 = str.toCharArray();
        int k = sc.nextInt();
        int l =0,r=0;
        int maxlen =0;
        HashMap<Character,Integer>hp=new HashMap<>();
        while(r<str1.length){
            hp.put(char[r],hp.getOrDefault(char[r],0)+1);

        }
    }
    
}