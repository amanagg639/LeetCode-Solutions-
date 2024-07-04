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
    public ListNode reverseList(ListNode head) {
        ListNode tempH = head;
        ListNode prev = null;
        while(tempH != null){
            ListNode Node = tempH.next;
            tempH.next = prev;
            prev = tempH;
            tempH = Node;
            
            

        }
        return prev;
    }
}