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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode dummy = new ListNode();
        ListNode fin = dummy;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1 !=null && temp2 !=null)
        {
            if(temp1.val <temp2.val)
            {
                fin.next = temp1;
                temp1 = temp1.next;
            }
            else
            {
                fin.next = temp2;
                temp2 = temp2.next;
            }
            fin = fin.next;
        }
        if (temp1 != null) fin.next = temp1;
        if (temp2 != null) fin.next = temp2;
        return dummy.next;
    }
}