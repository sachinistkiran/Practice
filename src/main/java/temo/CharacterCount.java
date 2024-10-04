package temo;

import java.util.HashMap;
import java.util.Map;

// aabbccd -> a,2 b,2,c,2
public class CharacterCount {
    public static void main(String[] args){
       charcount();
    }

    private static void charcount() {
        String s ="aabbccd";
        char[] c = s.toCharArray();

        int len = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<len;i++){
            if(hm.containsKey(c[i])){
                hm.put(c[i],hm.get(c[i])+1);
            }
            else{
                hm.put(c[i],1);
            }
        }
        for(Map.Entry entry :hm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
