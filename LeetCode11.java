public class LeetCode11 {
  public int maxArea(int[] height) {
    int i = 0, j = height.length - 1, area = 0;

    while (i < j) {
      int localArea = Math.min(height[i], height[j]) * (j - i);
      area = Math.max(area, localArea);
      if (height[i] < height[j])
        i++;
      else
        j--;
    }

    return area;
  }
}
