public class LeetCode125 {
  public boolean isPalindrome(String s) {
    char[] c = s.toCharArray();
    int i = 0, j = c.length - 1;

    while (i <= j) {
      if (!Character.isLetterOrDigit(c[i])) {
        i++;
        continue;
      }

      if (!Character.isLetterOrDigit(c[j])) {
        j--;
        continue;
      }

      if (Character.toLowerCase(c[i]) != Character.toLowerCase(c[j]))
        return false;

      i++;
      j--;
    }

    return true;
  }
}
