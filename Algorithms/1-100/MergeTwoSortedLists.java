
//Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sList=new ListNode(0);
        ListNode newNode=null;
        ListNode tail=sList;

        while(l1 !=null && l2!=null){
            if(l1.val<=l2.val){
                newNode=new ListNode(l1.val);
                l1=l1.next;
            }
            else {
                newNode=new ListNode(l2.val);
                l2=l2.next;
            }
            tail.next=newNode;
            tail=newNode;
        }
        if(l1!=null){
            tail.next=l1;
        }
        if(l2!=null){
            tail.next=l2;
        }
        return sList.next;
    }
}

/*
�� ����Ʈ�� �ִ�. �� ����Ʈ�� ���̸� ���� �����Ѵ�. L1�� ���̴� len1, L2�� ���̴� len2
����Ʈ�� ������ �ϴ°��̴�.
�� ����Ʈ�� ���ҵ��� ���ذ��� sortedList�� ���������� �����Ѵ�. --�⺻ ����--

i)���� �� ���� ���ٸ� L1���� �����Ѵ�. �׸��� �� index�� ++�Ѵ�.
ii) L1�� ���� ���) L1�� ���Ҹ� sortedList�� �߰��ϰ�, L1�� index�� ������Ų��.
iii) L2�� ���� ���) L2�� ���Ҹ� sortedList�� �߰��ϰ�, L2�� index�� ������Ų��.

�� List �� ��� ���� �� length�� �������� ���, �����ִ� ����Ʈ�� ��� sorted�� �߰���Ų��.
�̴� if���� ���� L1�� ���� ���� ���, L2�� ���� ���� ��츦 �������ش�.
*/