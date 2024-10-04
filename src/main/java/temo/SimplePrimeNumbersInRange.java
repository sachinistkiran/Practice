package temo;

public class SimplePrimeNumbersInRange {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();  // New line after printing primes
    }

    public static void main(String[] args) {
        int start = 10;  // Starting range
        int end = 50;    // Ending range

        // Call method to print prime numbers in the given range
        printPrimesInRange(start, end);
    }
}

