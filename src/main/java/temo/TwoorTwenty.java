package temo;
//program - Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

public class TwoorTwenty {
    public static void main(String[] args) {
        System.out.println(TwoorTwenty.checkMultiple(21));
        System.out.println(TwoorTwenty.checkMultiple(19));
        System.out.println(TwoorTwenty.checkMultiple(41));
        System.out.println(TwoorTwenty.checkMultiple(82));
        System.out.println(TwoorTwenty.checkMultiple(83));

    }

    public static boolean checkMultiple(int num) {
        if (num < 20) {
            return false;
        }
        if (num % 20 == 1 || num % 20 == 2) {
            return true;
        }
        return false;
    }
}
