package temo;

public class palindromeString {


    public static void main(String args[]) {
        checkpalindrome(121);
    }

    private static void checkpalindrome(int x) {
        String num = Integer.toString(x);
        System.out.println(num);

        String rev = "";
        for (int i = num.length()-1; i>=0; i--) {
            rev = rev + num.charAt(i);
        }
       System.out.println(rev);
        if (num.equals(rev)) {
            System.out.println("is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

}
