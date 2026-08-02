/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ArrayList<ListNode>Arr=new ArrayList<>();

        ListNode curr=head;

        while(curr!=null)
        {
            if(Arr.contains(curr))
            {
                return true;
            }
            else{
                Arr.add(curr);
            }
            curr=curr.next;
        }
        return false;
        
    }
}