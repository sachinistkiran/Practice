package temo;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {

    public static List<List<Integer>> countWaysToMakeChange(int[] coins, int sum) {
        List<List<List<Integer>>> dp = new ArrayList<>();

        for (int i = 0; i <= sum; i++) {
            dp.add(new ArrayList<>());
        }
        dp.get(0).add(new ArrayList<>());
        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                for (List<Integer> combination : dp.get(i - coin)) {
                    List<Integer> newCombination = new ArrayList<>(combination);
                    newCombination.add(coin);
                    dp.get(i).add(newCombination);
                }
            }
        }
        return dp.get(sum);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 4;
        List<List<Integer>> combinations = countWaysToMakeChange(coins, sum);
        System.out.println("Number of ways to make the sum " + sum + " is: " + combinations.size());

        System.out.println("Combinations are:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
