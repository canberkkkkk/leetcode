public class LeetCode49 {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> hm = new HashMap<>();

    for (int i = 0; i < strs.length; i++) {
      char[] chars = strs[i].toCharArray();
      Arrays.sort(chars);
      String sorted = new String(chars);

      if (hm.containsKey(sorted)) {
        hm.get(sorted).add(strs[i]);
        continue;
      }

      List<String> arr = new ArrayList<>();
      arr.add(strs[i]);
      hm.put(sorted, arr);
    }

    return new ArrayList<List<String>>(hm.values());
  }
}
