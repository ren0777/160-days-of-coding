// Last updated: 7/13/2026, 4:16:13 PM
// 0ms
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode temp=head;
14
15        while(head != null && head.next !=null){
16            if(head.val==head.next.val){
17                head.next=head.next.next;
18            }
19            else head=head.next;
20        }
21        return temp;
22        
23    }
24}