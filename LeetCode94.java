public class LeetCode94 {
  public void inorder(TreeNode root, List<Integer> ret) {
    if (root == null)
      return;

    inorder(root.left, ret);
    ret.add(root.val);
    inorder(root.right, ret);
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    inorder(root, ret);
    return ret;
  }
}
