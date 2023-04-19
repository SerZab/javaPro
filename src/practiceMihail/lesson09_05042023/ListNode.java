package practiceMihail.lesson09_05042023;

import java.util.LinkedList;
import java.util.List;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode() {
    }

    public boolean hasCycle(ListNode head) {

        return true;
    }

    public static void main(String[] args) {

        ListNode l5 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode l3 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l1 = new ListNode();

        l5.next = l3;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

    }
}
