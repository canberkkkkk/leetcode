public class LeetCode21 {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;

    ListNode node1 = list1, node2 = list2, node3 = null, head = null;

    if (node1.val < node2.val) {
      head = node1;
      node1 = node1.next;
    } else {
      head = node2;
      node2 = node2.next;
    }

    node3 = head;
    while (node1 != null && node2 != null) {
      if (node2.val >= node1.val) {
        node3.next = node1;
        node1 = node1.next;
      } else {
        node3.next = node2;
        node2 = node2.next;
      }

      node3 = node3.next;
    }

    while (node1 != null) {
      node3.next = node1;
      node3 = node3.next;
      node1 = node1.next;
    }

    while (node2 != null) {
      node3.next = node2;
      node3 = node3.next;
      node2 = node2.next;
    }

    return head;
  }
}
