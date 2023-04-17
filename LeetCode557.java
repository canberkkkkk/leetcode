public class LeetCode557 {
  public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0, j = i; j < s.length(); j++) {
      if (s.charAt(j) != ' ' && j < s.length() - 1)
        continue;

      for (int k = j != s.length() - 1 ? j - 1 : j; i <= k; k--)
        sb.append(s.charAt(k));

      if (j != s.length() - 1)
        sb.append(" ");

      i = j + 1;
    }

    return new String(sb);
  }
}
