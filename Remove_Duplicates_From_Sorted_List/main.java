package Remove_Duplicates_From_Sorted_List;

public class main {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

        ListNode listNode = new ListNode();
        listNode.val = 1;
        listNode.next.val = 1;
        listNode.next.next.val = 2;
        listNode.next.next.next.val = 5;

        ListNode head = listNode;

        removeDuplicatesFromSortedList.deleteDuplicates(head);
    }
}
