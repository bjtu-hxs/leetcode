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
public class Q141_LinkedListCycle {
//    // Method 1 1ms 72.81%
//    public boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//            if (fast == null) {
//                return false;
//            }
//            fast = fast.next;
//            if (fast == slow) {
//                return true;
//            }
//        }
//        return false;
//    }

    // Method 1 1ms 72.81%
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;
        while(true) {
            if (fast == null || fast.next == null) {
                return false;
            }
            else if (fast == slow || fast.next == slow){
                return true;
            }
            else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
    }
}
