package Add_Two_Numbers;

public class main {
    public static void main(String[] args) {

        var l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        var l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        var ans = new AddTwoNumbers();

        var expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        //act
        var actual = ans.addTwoNumbers(l1,l2);

        boolean equal = false;

        if((actual.val) == (expected.val)){
            equal = true;
        }else{
            equal = false;
        }

        System.out.println(equal);
    }
}
