public class LeetCode347 {
  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    PriorityQueue<List<Integer>> queue = new PriorityQueue<>((a, b) -> b.get(1) - a.get(1));

    for (int i = 0; i < nums.length; i++) {
      hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
    }

    for (Integer key : hm.keySet())
      queue.add(new ArrayList<Integer>(Arrays.asList(key, hm.get(key))));

    int[] ret = new int[k];
    for (int i = 0; i < k; i++)
      ret[i] = queue.poll().get(0);

    return ret;
  }
}
