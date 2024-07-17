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
    public  void reverseLL(ListNode temp){
        ListNode p = null;
        while(temp != null){
            ListNode node = temp.next;
            temp.next = p;
            p = temp;
            temp = node;
        }
    }
    public ListNode getKThnode(ListNode temp, int k){
        k -= 1;
        while(temp!=null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
       ListNode prev = null;
       while(temp != null){
        ListNode Kthnode = getKThnode(temp, k);
        if(Kthnode == null){
            if(prev != null){
                prev.next = temp;
            }
            break;
        }
        ListNode node = Kthnode.next;
        Kthnode.next = null;
        reverseLL(temp);
        if(temp == head){
            head = Kthnode;
        }
        else{
            prev.next = Kthnode;
        }
        prev = temp;
        temp = node;
       }
       return head;
    }
}