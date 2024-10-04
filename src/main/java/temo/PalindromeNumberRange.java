package temo;

public class PalindromeNumberRange {
    public static void main(String[] args) {

        for (int i = 100; i <= 2000; i++) {
            if (isPalindrome(i)) ;
            System.out.print(i + " ");
        }

    }

    public static boolean isPalindrome(int n) {

        int reversedNum = 0, remainder;
        int originalNum = n;
        while (n != 0) {
            remainder = n / 10;
            reversedNum = reversedNum * 10 + remainder;
            n = n / 10;

        }
        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
            return true;
        } else {
            System.out.println(originalNum + " is not Palindrome.");
            return false;
        }
    }
}

