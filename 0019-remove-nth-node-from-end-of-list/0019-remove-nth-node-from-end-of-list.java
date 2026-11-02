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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode ptr = head;
        ListNode tmp = head;
        int i = 1;
        while (i <= n) {
            ptr = ptr.next; 
            i++;
        }
        if (ptr == null) return head.next;
        while (ptr.next != null) {
            ptr = ptr.next;
            tmp = tmp.next;
        } 
        if (tmp.next != null) {
            tmp.next = tmp.next.next;
        }
        
        return head;
    }
}