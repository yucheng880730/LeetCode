package Merge_Two_Sorted_Lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        ListNode resultIterator = l3;

        ListNode p1 = l1;
        ListNode p2 = l2;

        int newNodeValue = 0;

        // System.out.println(p1.val);

        while(p1 != null && p2 != null){

            if(p1.val <= p2.val){

                newNodeValue = p1.val;
                p1 = p1.next;
                resultIterator.next = new ListNode(newNodeValue);
                resultIterator = resultIterator.next;

            }else{

                newNodeValue = p2.val;
                p2 = p2.next;
                resultIterator.next = new ListNode(newNodeValue);
                resultIterator = resultIterator.next;

            }
        }

        if(p1 != null) {
            resultIterator.next = p1;
        }

        if(p2 != null) {
            resultIterator.next = p2;
        }

        // System.out.println(l3.next);
        return l3.next;
    }
}


