package temo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWordsInFile {

    public static void main(String[] args) {
        String path = "/Users/snehal/Documents/sample.txt";
        HashMap<String, Integer> wordMap = new HashMap<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String[] words = currentLine.toLowerCase().split(" ");
                for (String word : words) {
                    if (wordMap.containsKey(word)) {
                        wordMap.put(word, wordMap.get(word) + 1);
                    } else {
                        wordMap.put(word, 1);
                    }
                }
                currentLine = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        wordMap.forEach((k, v) -> System.out.println(k + " : " + v));
        Map<String, Integer> finalMap = new HashMap<>();
        wordMap.entrySet().stream()
                .filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
                .forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));

//        finalMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}