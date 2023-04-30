public class LeetCode74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length, m = matrix[0].length;
    int lo = 0, hi = n - 1, rowIdx = 0;

    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (matrix[mid][0] <= target && target <= matrix[mid][m - 1]) {
        rowIdx = mid;
        break;
      } else if (matrix[mid][0] <= target && matrix[mid][m - 1] <= target)
        lo = mid + 1;
      else if (matrix[mid][0] >= target)
        hi = mid - 1;
    }

    lo = 0;
    hi = m - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (target == matrix[rowIdx][mid])
        return true;
      else if (target < matrix[rowIdx][mid])
        hi = mid - 1;
      else if (target > matrix[rowIdx][mid])
        lo = mid + 1;
    }

    return false;
  }
}
