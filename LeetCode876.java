public class LeetCode876 {
  public ListNode middleNode(ListNode head) {
    ListNode node = head;
    int size = 0;

    while (node != null) {
      size++;
      node = node.next;
    }

    node = head;
    for (int i = 0; i < size / 2; i++)
      node = node.next;

    return node;
  }
}
