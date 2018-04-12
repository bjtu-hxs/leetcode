/*//  Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}*/

class Q002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        // Method_01
        ListNode current = new ListNode(0);
        ListNode root = current;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            current.next = new ListNode(0);
            current = current.next;
            current.val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = current.val / 10;
            current.val = current.val % 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return root.next;
        */

        /*
        // Method_02
        ListNode current = new ListNode(0);
        ListNode root = current;
        int carry = 0;

        while (l1 != null || l2 != null) {
            current.next = new ListNode(0);
            current = current.next;
            current.val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = current.val / 10;
            current.val = current.val % 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry == 1){
            current.next = new ListNode(1);
        }

        return root.next;
        */


        // Method_03
        ListNode current = new ListNode(0);
        ListNode root = current;
        int carry = 0;
        int tmp;

        while (l1 != null || l2 != null) {
            tmp = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = tmp / 10;
            tmp = tmp % 10;
            current.next = new ListNode(tmp);
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry == 1){
            current.next = new ListNode(1);
        }

        return root.next;
    }

}