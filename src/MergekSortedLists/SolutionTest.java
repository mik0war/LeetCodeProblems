package MergekSortedLists;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest{

    @Test
    public void test() throws InterruptedException {
        ListNode[] listNodes =  new ListNode[] { new ListNode(1, new ListNode(4, new ListNode(5))),
                                new ListNode(1, new ListNode(3, new ListNode(4))),
                                new ListNode(2, new ListNode(6))};

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                                            new ListNode(3, new ListNode(4,
                                                    new ListNode(4, new ListNode(5,
                                                            new ListNode(6))))))));
        ListNode actual = ListNode.mergeKLists(listNodes);

        assert actual.equals(expected);
    }

}
