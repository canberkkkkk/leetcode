public class LeetCode144 {
  public void preorder(TreeNode root, List<Integer> ret) {
    if (root == null)
      return;

    ret.add(root.val);
    preorder(root.left, ret);
    preorder(root.right, ret);
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<Integer>();
    preorder(root, ret);
    return ret;
  }
}
