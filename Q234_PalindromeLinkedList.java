/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Q234_PalindromeLinkedList {
//    // Method 1 2ms 78.51%
//    public boolean isPalindrome(ListNode head) {
//        if (head == null || head.next == null) {
//            return true;
//        }
//        ListNode headBackup = head;
//        ListNode tail = null;
//        ListNode tmp = tail;
//        while (head != null) {
//            tail = new ListNode(head.val);
//            tail.next = tmp;
//            tmp = tail;
//            head = head.next;
//        }
//        while (headBackup != null) {
//            if (headBackup.val != tail.val) {
//                return false;
//            }
//            headBackup = headBackup.next;
//            tail = tail.next;
//        }
//        return true;
//    }

    // Method 2 1ms 98.12%
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        int count = 1;
        ListNode counter = head;
        while (counter.next != null) {
            count++;
            counter = counter.next;
        }

        int n = count / 2;

        ListNode tail = head.next;
        head.next = null;

        for (int i = 1; i < n; i++) {
            ListNode tmp = tail.next;
            tail.next = head;
            head = tail;
            tail = tmp;
        }

        if (count % 2 == 1) {
            tail = tail.next;
        }

        while (tail != null) {
            if (head.val != tail.val) {
                return false;
            }
            tail = tail.next;
            head = head.next;
        }

        return true;
    }
}