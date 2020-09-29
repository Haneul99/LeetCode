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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode();
        temp=head;
        ListNode temp2=new ListNode();
        if(head==null) return null;
        while(temp!=null){
            if(temp.val==val){//remove
                if(temp==head) {//remove head
                    if(temp.next==null) return null;//have one element
                    else{//else
                        head=head.next;
                        temp=head;
                    }
                }
                else{//remove middle~last
                    temp2=head;
                    while(temp2.next!=temp) {//get previous
                	    temp2=temp2.next;
                    }
                    temp2.next=temp.next;
                    temp=temp.next;
                }
            }
            else temp=temp.next;
        }
        return head;
    }
}

/*
203. Remove Linked List Elements
https://leetcode.com/problems/remove-linked-list-elements/

Remove all elements from a linked list of integers that have value val.
*/