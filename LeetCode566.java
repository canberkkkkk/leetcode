public class LeetCode566 {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    if (r * c != mat.length * mat[0].length)
      return mat;

    int[][] ret = new int[r][c];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        int place = (i * mat[0].length) + j;
        ret[place / c][place % c] = mat[i][j];
      }
    }

    return ret;
  }
}
