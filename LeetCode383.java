public class LeetCode383 {
  public boolean canConstruct(String ransomNote, String magazine) {
    int[] arr = new int[26];
    int n = ransomNote.length(), m = magazine.length(), maxLen = Math.max(m, n);

    for (int i = 0; i < maxLen; i++) {
      if (i < n)
        arr[ransomNote.charAt(i) - 'a']++;
      if (i < m)
        arr[magazine.charAt(i) - 'a']--;
    }

    for (int i = 0; i < arr.length; i++)
      if (arr[i] > 0)
        return false;

    return true;
  }
}
