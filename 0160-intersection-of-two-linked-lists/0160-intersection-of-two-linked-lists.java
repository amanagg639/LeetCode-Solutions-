/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int ac=0,bc=0;
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null){
            ac++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            bc++;
            temp2=temp2.next;
        }
        while(ac>bc){
            ac--;
            headA=headA.next;
        }
        while(bc>ac){
            bc--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}