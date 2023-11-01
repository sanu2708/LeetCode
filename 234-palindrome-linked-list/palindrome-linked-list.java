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
    public boolean isPalindrome(ListNode head) {
    // Convert the linked list to an array list
    ArrayList<Integer> values = new ArrayList<>();
    while (head != null) {
        values.add(head.val);
        head = head.next;
    }
    
    // Check if the array list is equal to its reverse
    int n = values.size();
    for (int i = 0; i < n / 2; i++) {
        if (!values.get(i).equals(values.get(n - i - 1))) {
            return false;
        }
    }
    return true;
}
}