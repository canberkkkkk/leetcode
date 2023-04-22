public class LeetCode145 {
  public void postorder(TreeNode root, List<Integer> ret) {
    if (root == null)
      return;

    postorder(root.left, ret);
    postorder(root.right, ret);
    ret.add(root.val);
  }

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    postorder(root, ret);
    return ret;
  }
}
