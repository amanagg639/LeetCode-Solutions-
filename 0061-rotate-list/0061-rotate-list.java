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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return head;
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        if(k%n==0)return head;
        k = n>k?k : k%n;
        temp = head;
        for(int i=0; i<n-k-1; i++){
            temp = temp.next;
        }
        ListNode res = temp.next;
        temp.next = null;
        ListNode prev = res;
        while(prev.next != null){
            prev = prev.next;
        }
        prev.next = head;
        return res;

    }
}