/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
     public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // Cannot delete the last node or a null node.
            return;
        }

        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}