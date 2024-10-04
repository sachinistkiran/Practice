package temo;


public class BinaryToDecimalNumber {
    public static void main(String[] args) {
        int binary = 111;

        BinaryToDecimalNumber n = new BinaryToDecimalNumber();
        System.out.println("Binary input is : " + binary);
        System.out.println("Decimal output is : " + n.convertToDecimal(binary));
    }

    private int convertToDecimal(int binary) {
        int n = 0;
        int temp = 0;
        int decimal = 0;
        if (binary == 0) {
            return 0;
        }
        while (binary > 0) {
            temp = binary % 10;
            decimal = (int) (decimal + temp * Math.pow(2, n));
            binary = binary / 10;
            n++;
        }
        return decimal;
    }
}
