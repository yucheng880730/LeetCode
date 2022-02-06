package Linked_List_Cycle;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        // smart solution with two pointer!
        if (head == null) return false;

        ListNode slow = head, fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;

// my solution
// it works !!
//
//        int count = 0;
//
//        if(head == null) return false;
//
//        while (head.next != null && count < 10001){
//            count++;
//            head = head.next;
//        }
//
//        if(count < 10001) {
//            return false;
//        } else {
//            return true;
//        }
    }
}
