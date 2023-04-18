public class LeetCode167 {
  public int[] twoSum(int[] numbers, int target) {
    int i = 0, j = numbers.length - 1, sum;

    while ((sum = numbers[i] + numbers[j]) != target) {
      if (sum > target)
        j--;

      if (sum < target)
        i++;
    }

    return new int[] { i + 1, j + 1 };
  }
}
