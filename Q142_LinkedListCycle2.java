/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Q142_LinkedListCycle2 {
    // Method 1 1ms 98.95%
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        ListNode p = head;
        while(fast != null && fast != slow) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        if (fast != null) {
            fast = fast.next;
            while(fast != p) {
                fast = fast.next;
                p = p.next;
            }
        }
        return fast;
    }
}