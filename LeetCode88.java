public class LeetCode88 {
  public void merge(int[] aux, int m, int[] nums2, int n) {
    int[] nums1 = new int[m];
    for (int i = 0; i < m; i++)
      nums1[i] = aux[i];

    int i = 0, j = 0, k = 0;
    while (i < m && j < n)
      aux[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];

    while (i < m)
      aux[k++] = nums1[i++];

    while (j < n)
      aux[k++] = nums2[j++];
  }
}
