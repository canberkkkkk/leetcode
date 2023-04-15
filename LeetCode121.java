public class LeetCode121 {
  public int maxProfit(int[] prices) {
    int profit = 0, i = 0, j = 1;

    while (i < prices.length && j < prices.length) {
      if (prices[i] > prices[j]) {
        i = j;
        j++;
        continue;
      }

      int currentProfit = prices[j] - prices[i];
      if (currentProfit > profit)
        profit = currentProfit;

      j++;
    }

    return profit;
  }
}
