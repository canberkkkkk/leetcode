public class LeetCode665 {
  public boolean checkPossibility(int[] nums) {
    int max = Integer.MIN_VALUE;
    boolean changed = false;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        if (changed)
          return false;

        if (Math.min(nums[i], nums[i + 1]) < max)
          nums[i + 1] = nums[i];
        else
          nums[i] = nums[i + 1];

        if (max > nums[i])
          return false;

        changed = true;
      }

      max = nums[i];
    }

    return true;
  }
}
