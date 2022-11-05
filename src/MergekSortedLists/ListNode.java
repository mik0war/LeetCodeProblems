package MergekSortedLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;

        ListNode resultPointer = new ListNode(-1);
        ListNode result = resultPointer;
        ListNode min = new ListNode(Integer.MAX_VALUE);
        int minIndex = -1;

        while (true) {
            for (int i = 0; i < lists.length; i++) {
                ListNode listNode = lists[i];
                if (listNode != null)
                    if (min == null || min.val >= listNode.val) {
                        min = listNode;
                        minIndex = i;
                    }
            }

            if (min == null)
                break;

            result.next = new ListNode(min.val);
            result = result.next;


            lists[minIndex] = lists[minIndex].next;
            min = null;
        }

        return resultPointer.next;
    }

    public boolean equals(ListNode list) {
        ListNode currentList = this;
        while (currentList.next != null) {
            if (currentList.val != list.val)
                return false;
            currentList = currentList.next;
            list = list.next;
        }
        return true;

    }
}
