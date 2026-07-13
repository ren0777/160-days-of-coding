// Last updated: 7/13/2026, 4:36:50 PM
// 1ms
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
12    public ListNode insertGreatestCommonDivisors(ListNode head) {
13        ListNode current=head;
14
15        while( current != null && current.next != null){
16            int gcd=gcd(current.val,current.next.val);
17
18            ListNode newNode=new ListNode(gcd);
19
20            newNode.next=current.next;
21            current.next=newNode;
22
23            current = newNode.next;
24
25        }
26        return head;
27    }
28    int gcd(int a,int b){
29        while( b!=0){
30            int temp=b;
31            b=a%b;
32            a=temp;
33        }   
34        return a;
35    }   
36}