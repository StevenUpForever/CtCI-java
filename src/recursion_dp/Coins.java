package recursion_dp;

public class Coins {

    /*
    Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents), and pennies (1 cent), write code to calculate the number of ways of representing n cents.
     */

    /*
    Time: O(n^m) m is length of coins
    Space: O(m)
     */

    private int res = 0;
    public int coins(int[] coins, int n) {
        coinsHelper(coins, 0, n);
        return res;
    }

    private void coinsHelper(int[] coins, int index, int monLeft) {
        if (monLeft <= 0 || index == coins.length) {
            if (monLeft == 0) res++;
            return;
        }
        for (int i = 0; coins[index] * i <= monLeft; i++) {
            coinsHelper(coins, index + 1, monLeft - coins[index] * i);
        }
    }

}
