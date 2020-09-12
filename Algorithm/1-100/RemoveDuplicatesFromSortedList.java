class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp=head;
    	while(temp.next!=null) {
    		if(temp.val==temp.next.val) {
                if(temp.next.next!=null)
                    temp.next=temp.next.next;
                else temp.next=null;
            }
    		else temp=temp.next;
            if(temp==null) break;
    	}
		return head;
    }
}
/*
null list check
while loop : length of linked list
if(temp.val==temp.next) remove next : temp.next=temp.next.next
*/