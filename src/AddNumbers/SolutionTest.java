package AddNumbers;

import org.junit.Test; 

public class SolutionTest { 

@Test
public void testAddTwoNumbersTest1() throws Exception {
    //Test case 1
    ListNode firstArgument = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode secondArgument = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode expectedResult = new ListNode(7, new ListNode(0, new ListNode(8)));

    Solution solution = new Solution();

    ListNode givenResult = solution.addTwoNumbers(firstArgument, secondArgument);

    while (givenResult != null) {
        assert expectedResult.val == givenResult.val;

        givenResult = givenResult.next == null? null : givenResult.next;
        expectedResult = expectedResult.next == null? null : expectedResult.next;
    }
}

    @Test
    public void testAddTwoNumbersTest2() throws Exception {
        //Test case 1
        ListNode firstArgument = new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode secondArgument = new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9))));
        ListNode expectedResult = new ListNode(8, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(0, new ListNode(0,
                        new ListNode(0, new ListNode(1))))))));

        Solution solution = new Solution();

        ListNode givenResult = solution.addTwoNumbers(firstArgument, secondArgument);

        while (givenResult != null) {
            assert expectedResult.val == givenResult.val;

            givenResult = givenResult.next == null? null : givenResult.next;
            expectedResult = expectedResult.next == null? null : expectedResult.next;
        }
    }


} 
