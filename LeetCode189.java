public class LeetCode189 {
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length);
    reverse(nums, 0, k);
    reverse(nums, k, nums.length);
  }

  public void reverse(int[] arr, int start, int end) {
    for (int i = start; i < (start + end) / 2; i++) {
      int idx = start + end - i - 1, temp = arr[idx];
      arr[idx] = arr[i];
      arr[i] = temp;
    }
  }
}
