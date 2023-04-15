public class LeetCode128 {
  public int longestConsecutive(int[] nums) {
    Set<Integer> hs = new HashSet<Integer>();

    for (Integer n : nums)
      hs.add(n);

    int ret = 0, longestSoFar = 1;
    for (Integer n : hs) {
      if (hs.contains(n - 1))
        continue;

      while (hs.contains(n + 1)) {
        n++;
        longestSoFar++;
      }

      ret = Math.max(ret, longestSoFar);
      longestSoFar = 1;
    }

    return ret;
  }
}
