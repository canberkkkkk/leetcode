public class LeetCode238 {
  public int[] productExceptSelf(int[] nums) {
    int[] ret = new int[nums.length];
    int naturalMult = 1, reverseMult = 1;

    for (int i = 0; i < nums.length; i++) {
      ret[i] = naturalMult;
      naturalMult *= nums[i];
    }

    for (int i = nums.length - 1; 0 <= i; i--) {
      ret[i] *= reverseMult;
      reverseMult *= nums[i];
    }

    return ret;
  }
}
