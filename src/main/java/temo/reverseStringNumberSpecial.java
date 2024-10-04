package temo;

import java.util.Arrays;

public class reverseStringNumberSpecial {
    public static void main(String[] args) {
        String str = "Ab,1,c,d,3,e!$";
        char[] charArray = str.toCharArray();
        reverse(charArray);
    }

    private static void reverse(char[] charArray) {
        char[] c = new char[charArray.length];
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                c[index++] = charArray[i];
            }
        }
        System.out.println(""+new String(c).trim());
        int alphabetIndex = index - 1;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                charArray[i] = c[alphabetIndex--];
            }
        }
        System.out.println("Reversed String  " + new String(charArray));
    }
}
