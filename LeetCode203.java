public class LeetCode203 {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null)
      return head;

    while (head != null && head.val == val)
      head = head.next;

    ListNode node = head;
    while (node != null && node.next != null) {
      if (node.next.val == val) {
        node.next = node.next.next;
        continue;
      }

      node = node.next;
    }

    return head;
  }
}
