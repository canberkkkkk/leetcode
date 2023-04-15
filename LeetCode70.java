public class LeetCode70 {
  public int climbStairs(int n) {
    if (n == 1 || n == 0)
      return n;

    int[] dp = new int[n];
    dp[n - 1] = 1;
    dp[n - 2] = 2;

    for (int i = n - 3; 0 <= i; i--)
      dp[i] = dp[i + 1] + dp[i + 2];

    return dp[0];
  }
}
