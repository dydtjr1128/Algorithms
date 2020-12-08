import java.util.Deque;
import java.util.LinkedList;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();
        while (l1 != null) {
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.add(l2.val);
            l2 = l2.next;
        }

        Deque<Integer> result = new LinkedList<>();
        int up = 0;
        do {
            int a = 0;
            int b = 0;
            if (!stack1.isEmpty()) {
                a = stack1.pop();
            }
            if (!stack2.isEmpty()) {
                b = stack2.pop();
            }
            int calc = a + b + up;
            result.add(calc % 10);
            up = calc / 10;
        } while (!stack1.isEmpty() || !stack2.isEmpty());
        if (up == 1) {
            result.add(1);
        }
        ListNode root = new ListNode();
        root.val = result.poll();

        root.next = result.isEmpty() ? null : new ListNode();
        ListNode temp = root.next;
        while (!result.isEmpty()) {
            temp.val = result.poll();
            if (result.isEmpty()) {
                temp.next = null;
            } else {
                temp.next = new ListNode();
            }
            temp = temp.next;
        }

        return root;
    }

    public static void main(String[] args) {
        /*ListNode listNode = new ListNode();
        listNode.val = 2;
        listNode.next = new ListNode();

        listNode.next.val = 4;
        listNode.next.next = new ListNode();

        listNode.next.next.val = 3;
        listNode.next.next.next = null;

        ListNode listNode2 = new ListNode();
        listNode2.val = 5;
        listNode2.next = new ListNode();

        listNode2.next.val = 6;
        listNode2.next.next = new ListNode();

        listNode2.next.next.val = 4;
        listNode2.next.next.next = null;*/
        ListNode listNode = new ListNode();
        listNode.val = 0;
        listNode.next = null;

        ListNode listNode2 = new ListNode();
        listNode2.val = 0;
        listNode2.next = null;
        Solution solution = new Solution();
        solution.addTwoNumbers(listNode, listNode2);
    }
}