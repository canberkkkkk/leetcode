public class LeetCode22 {
  public List<String> generateParenthesis(int n) {
    List<String> ret = new ArrayList<>();
    solve(ret, "", n, 0, 0);
    return ret;
  }

  public void solve(List<String> arr, String s, int n, int openCount, int closedCount) {
    if (openCount == n && openCount == closedCount) {
      arr.add(s);
      return;
    }

    if (openCount < n)
      solve(arr, s + "(", n, openCount + 1, closedCount);

    if (closedCount < openCount)
      solve(arr, s + ")", n, openCount, closedCount + 1);
  }
}
