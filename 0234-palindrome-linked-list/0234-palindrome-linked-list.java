class Solution {
    private ListNode reverse(ListNode head) {
        ListNode prev =null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
    }


    public boolean isPalindrome(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode rev=reverse(slow);
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
        
            head = head.next;
            rev=rev.next;
        }
        return true;

      
    }
}