public class LeetCode350 {
  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0, j = 0;
    ArrayList<Integer> temp = new ArrayList<Integer>();

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        temp.add(nums1[i]);
        i++;
        j++;
        continue;
      }

      if (nums1[i] < nums2[j])
        i++;
      else
        j++;
    }

    int[] ret = new int[temp.size()];
    for (i = 0; i < temp.size(); i++)
      ret[i] = temp.get(i);

    return ret;
  }
}
