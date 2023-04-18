public class LeetCode876 {
  public ListNode middleNode(ListNode head) {
    ListNode slowNode = head, fastNode = head;

    while (fastNode != null && fastNode.next != null) {
      slowNode = slowNode.next;
      fastNode = fastNode.next.next;
    }

    return slowNode;
  }
}
