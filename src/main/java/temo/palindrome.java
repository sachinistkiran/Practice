package temo;

public class palindrome {
    public static boolean checkpalindrome(String s){
        String rev = "";
        for (int i = s.length()-1; i>=0; i--) {
            rev = rev + s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.println("true");
           return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

    public static void main(String args[]) {
        checkpalindrome("0P");
    }
}