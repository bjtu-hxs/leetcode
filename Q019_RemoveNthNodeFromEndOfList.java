/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Q019_RemoveNthNodeFromEndOfList {
    // Method_01  10ms  95.16%
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        while (n-- > 0) {
            cur = cur.next;
        }
        if (cur == null) {
            return head.next;
        }
        ListNode pre = head; // 指向目标节点的前一个节点
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;

        return head;
    }

    // Method_02
    public ListNode removeNthFromEnd_02(ListNode head, int n) {
        for (ListNode node = head; node != null; node = node.next, n--) ;
        if (n == 0) {
            return head.next;
        }
        for (ListNode node = head; node != null; node = node.next) {
            n++;
            if (n == 0) {
                node.next = node.next.next;
                return head;
            }
        }
        return head;
    }
}