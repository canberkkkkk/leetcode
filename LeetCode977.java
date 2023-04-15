public class LeetCode977 {
  public int[] sortedSquares(int[] nums) {
    int[] ret = new int[nums.length];
    int i = 0, j = nums.length - 1, k = j;

    while (0 <= k)
      ret[k--] = Math.abs(nums[i]) > Math.abs(nums[j]) ? (nums[i] * nums[i++]) : nums[j] * nums[j--];

    return ret;
  }
}
