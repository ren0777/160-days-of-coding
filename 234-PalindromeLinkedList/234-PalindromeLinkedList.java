// Last updated: 6/16/2026, 8:46:54 AM
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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current =head;
        while(current != null){
            ListNode nextNode=current.next;
            current.next= prev;
            prev=current;
            current = nextNode;
        }
        return prev;
    }
      public static ListNode middleNode(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

    

    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next==null){
        return true;
       }
       ListNode middle=middleNode(head);

       ListNode rev = reverse(middle);
       ListNode first=head;

       while(rev != null){
        if(first.val != rev.val){
            return false;
        }
        first =first.next;
        rev=rev.next;
       }
    return true;        
    }
}