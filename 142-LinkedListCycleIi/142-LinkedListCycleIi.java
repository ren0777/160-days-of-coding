// Last updated: 6/16/2026, 8:47:14 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> s=new HashSet<>();
        while(head!=null){
            if(s.contains(head)==true) return head;
            s.add(head);
            head=head.next;
        }
        return null;
    }
}