public class LeetCode35 {
  public int searchInsert(int[] nums, int target) {
    int lo = 0, hi = nums.length, mid;

    while (lo < hi) {
      mid = lo + (hi - lo) / 2;
      if (target <= nums[mid])
        hi = mid;
      else
        lo = mid + 1;
    }

    return lo;
  }
}
