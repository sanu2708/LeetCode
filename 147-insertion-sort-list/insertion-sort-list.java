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
class Solution {
   public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            insert(dummy, curr);
            curr = nextNode;
        }

        return dummy.next;
    }

    private void insert(ListNode dummy, ListNode node) {
        ListNode prev = dummy;
        ListNode curr = dummy.next;

        while (curr != null && curr.val < node.val) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = node;
        node.next = curr;
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}