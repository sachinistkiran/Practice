package temo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Filereader {
    public static void main(String args[]) {
        Path filePath = Paths.get("/Users/kiran/IdeaProjects/practice/src/temo/temp.txt");
        try {
            String content = Files.readString(filePath);
            String [] words = content.split(" ");
            System.out.println(content);

            HashMap<String, Integer> freq = getfrequencycount(words);
            int max = getmaxValueFromMap(freq);
            String key = getMaxvalueKey(freq,max);

            System.out.println(key);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String getMaxvalueKey(HashMap<String, Integer> freq, int max) {
        String res ="";
        for(Map.Entry<String,Integer> iterator : freq.entrySet()){
            int value = iterator.getValue();
            if(value==max){
                res = iterator.getKey();
            }
        }

        return res;

    }

    private static int getmaxValueFromMap(HashMap<String, Integer> freq) {
        int max =Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> mapElement : freq.entrySet()) {
            String key = mapElement.getKey();
            int value = mapElement.getValue();

            if(max<value){
                max=value;
            }

        }
        return max;
    }

    private static HashMap<String, Integer> getfrequencycount(String[] words) {
        HashMap <String,Integer> hm = new HashMap<>();
            for(int i=0;i<words.length;i++){
                hm.put(words[i],hm.getOrDefault(words[i],0)+1);
         }
        return hm;
    }


}
