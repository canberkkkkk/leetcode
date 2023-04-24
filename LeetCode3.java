public class LeetCode3 {
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0)
      return 0;

    int i = 0, j = 0, longest = 0, longestTemp = 0;
    char[] arr = s.toCharArray();
    Map<Character, Integer> hm = new HashMap<Character, Integer>();

    while (i < arr.length && j < arr.length) {
      if (hm.containsKey(arr[j]) && hm.get(arr[j]) >= i) {
        i = hm.get(arr[j]);
        hm.put(arr[j], j);
        longestTemp = (j++) - i;
        continue;
      }

      longestTemp++;
      hm.put(arr[j], j++);

      if (longestTemp > longest)
        longest = longestTemp;
    }

    return longest;
  }
}
