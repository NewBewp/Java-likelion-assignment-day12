package day17.exercise;


import org.w3c.dom.Node;

public class Application {
    public static void main(String[] args) {
        int[] head = {1,2,3,4,5};
        ListNode node = new ListNode(head[0]);
        ListNode current = node;
        for (int i = 1; i < head.length; i++) {
            current.next = new ListNode(head[i]);
            current = current.next;
        }

        middleNode(node);
    }

    public static void middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }
}
