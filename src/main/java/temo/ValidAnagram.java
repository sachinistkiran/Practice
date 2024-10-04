package temo;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "eat";
        String t = "ate";
        ValidAnagram.isAnagram(s, t);
    }

    public static void isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int[] array = new int[26];
        for (int i = 0; i < ch1.length; i++) {
            array[ch1[i] - 97]++;
        }
        for (int j = 0; j < ch2.length; j++) {
            array[ch2[j] - 97]--;
        }
        for (int k = 0; k < 26; k++) {
            if (array[k] != 0) {
                System.out.println("Not an Anagram");
            }
        }
        System.out.println("IS Anagram");
    }
}
