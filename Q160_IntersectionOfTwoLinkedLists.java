/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Q160_IntersectionOfTwoLinkedLists {
//    // Method 1 2ms 80.42%
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null)
//        {
//            return null;
//        }
//        ListNode pA = headA;
//        ListNode pB = headB;
//        while (pA != pB) {
//            pA = pA == null ? headB : pA.next;
//            pB = pB == null ? headA : pB.next;
//        }
//        return pA;
//    }

    // Method 1 2ms 80.42%
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
        {
            return null;
        }
        int lengthA = 0;
        int lengthB = 0;
        ListNode p = headA;
        while(p != null){
            lengthA++;
            p = p.next;
        }
        p = headB;
        while(p != null) {
            lengthB++;
            p = p.next;
        }
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                headA = headA.next;
            }
        }
        if (lengthA <= lengthB) {
            for (int i = 0; i < lengthB - lengthA; i++) {
                headB = headB.next;
            }
        }
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}