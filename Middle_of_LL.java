

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        int count = 0;
        ListNode curr = head;

        // First pass to count nodes
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Second pass to reach middle
        curr = head;
        for (int i = 0; i < count / 2; i++) {
            curr = curr.next;
        }

        return curr;
    }
}

public class Middle_of_LL {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution sol = new Solution();
        ListNode middle = sol.middleNode(head);

        // Print the value of the middle node
        if (middle != null) {
            System.out.println("Middle node value: " + middle.val);
        } else {
            System.out.println("List is empty.");
        }
    }
}   
