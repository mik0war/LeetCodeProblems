package AddNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode sumResult = sum;
        int integer_part = 0;
        while (true){
                int node = l1.val + l2.val + integer_part;
                integer_part = node / 10;
                System.out.println(node);
                sum.val = (node)%10;

                if (l1.next == null && l2.next == null){
                    if (integer_part != 0) {
                        sum.next = new ListNode(integer_part);
                        sum = sum.next;
                    }
                    break;
                }
                else {
                    sum.next = new ListNode();
                    sum = sum.next;
                }

                if (l1.next != null)
                    l1 = l1.next;
                else l1.val = 0;

                if (l2.next != null)
                    l2 = l2.next;
                else l2.val = 0;

            }

        return sumResult;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4))));

        while (result != null) {
            System.out.print(result.val + " ");
            if (result.next != null)
                result = result.next;
            else result = null;
        }
    }

}