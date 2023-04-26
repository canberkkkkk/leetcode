public class LeetCode700 {
  public TreeNode searchBST(TreeNode root, int val) {
    TreeNode node = root;

    while (node != null) {
      if (val < node.val)
        node = node.left;
      else if (val > node.val)
        node = node.right;
      else
        return node;
    }

    return null;
  }
}
