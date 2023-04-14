public class LeetCode278 {
  public int firstBadVersion(int n) {
    int lo = 1, hi = n, foundTrueAt = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (isBadVersion(mid)) {
        foundTrueAt = mid;
        hi = mid - 1;
      } else
        lo = mid + 1;
    }

    return foundTrueAt;
  }
}
