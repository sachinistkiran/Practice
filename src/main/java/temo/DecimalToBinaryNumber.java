package temo;

public class DecimalToBinaryNumber {
    public static void main(String[] args) {
        int num = 8;
        DecimalToBinaryNumber n = new DecimalToBinaryNumber();
        System.out.println(n.convertToBinary(num));
    }

    private String convertToBinary(int num) {
        String binaryNum = "";
        if (num == (0)) {
            return "0";
        }
        int reminder = 0;
        while (num > 0) {
            reminder = num % 2;
            binaryNum = reminder + binaryNum;
            num = num / 2;
        }
        return binaryNum;
    }
}
