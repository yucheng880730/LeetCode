package Intersection_of_Two_Linked_Lists;

public class IntersectionOfTwoLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        if(a == null && b == null) return null;

        while(a != b){
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        return  a;
    }
}
