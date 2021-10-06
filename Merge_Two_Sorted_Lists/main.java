package Merge_Two_Sorted_Lists;

public class main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeTwoSortedLists x = new MergeTwoSortedLists();
        x.mergeTwoLists(l1, l2);

    }
}
