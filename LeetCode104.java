public class LeetCode104 {
  public int maxDepthDfs(TreeNode root, int height) {
    if (root == null)
      return height;

    return Math.max(maxDepthDfs(root.left, height + 1), maxDepthDfs(root.right, height + 1));
  }

  public int maxDepth(TreeNode root) {
    return maxDepthDfs(root, 0);
  }
}
