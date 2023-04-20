public class LeetCode83 {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode node = head;
    while (node != null && node.next != null) {
      while (node.next != null && node.val == node.next.val)
        node.next = node.next.next;

      node = node.next;
    }

    return head;
  }
}
