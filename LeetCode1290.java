public class LeetCode1290 {
  public int getDecimalValue(ListNode head) {
    ListNode node = head;
    int size = 0, decimal = 0;

    while (node != null) {
      size++;
      node = node.next;
    }

    node = head;
    for (int i = 0; i < size; i++, node = node.next)
      decimal += node.val * Math.pow(2, size - i - 1);

    return decimal;
  }
}
