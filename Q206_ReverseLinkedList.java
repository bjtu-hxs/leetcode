/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Q206_ReverseLinkedList {
    // Method_02  1ms  21.74%
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newListNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newListNode;
    }

//    // Method_01  0ms  100.00%
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode pre = null;
//        ListNode next;
//        while(head.next != null) {
//            next = head.next;
//            head.next = pre;
//            pre = head;
//            head = next;
//        }
//        head.next = pre;
//
//        return head;
//    }
}
