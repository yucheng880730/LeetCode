package Remove_Duplicates_From_Sorted_List;



// Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}


public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode curr = head;
        int value = head.val;

        while(head.next != null) {
            if(head.next.val == value) {

                if(head.next.next != null) {
                    head.next = head.next.next;
                } else {
                    head.next = null;
                }

            }
            else {
                value = head.next.val;
                head = head.next;
            }
        }
        return curr;
    }
}
