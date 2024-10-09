package temo;

public class CoinChange {

    public static int countWaysToMakeChange(int[] coins, int sum) {
        // Create a dp array to store the number of ways to make change for each value
        int[] dp = new int[sum + 1];

        // There is exactly one way to make sum 0 (by using no coins)
        dp[0] = 1;

        // Loop over each coin
        for (int coin : coins) {
            // Update dp array for all sums greater than or equal to the coin value
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        // Return the number of ways to make the sum
        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 4;

        int numberOfWays = countWaysToMakeChange(coins, sum);
        System.out.println("Number of ways to make the sum " + sum + " is: " + numberOfWays);
    }
}

