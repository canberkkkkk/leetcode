public class LeetCode83 {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode node = head;
    while (node != null && node.next != null) {
      if (node.val == node.next.val) {
        node.next = node.next.next;
        continue;
      }

      node = node.next;
    }

    return head;
  }
}
