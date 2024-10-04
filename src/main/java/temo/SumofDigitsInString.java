package temo;

public class SumofDigitsInString {
    public static void main(String[] args) {
        String s = "ab12cd3e4";

        int sum = sumOFDigits(s);
        System.out.println(sum);
    }

    public static int sumOFDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sum = sum + Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
