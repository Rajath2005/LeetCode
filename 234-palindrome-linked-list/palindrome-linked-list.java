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
    public boolean isPalindrome(ListNode head) {

        // ListNode link=head;
        // ListNode curr=head;

        // while(curr!=null)
        // {
        //     curr=curr.next;
        // }
        // ListNode temp=curr;
        // if(link==temp)
        // {
        //     return true;
        // }

        // return false;

        // ListNode slow=head;
        // ListNode fast=head;

        // while(fast!=null && fast.next!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;

        //     if(slow==fast)
        //     {
        //         return true;
        //     }
        // }
        // return false;

        // HashSet<ListNode>mpp=new HashSet<>();

        // ListNode curr=head;

        // while(curr!=null)
        // {
        //     if(mpp.contains(curr))
        //     {
        //         return true;
        //     }
        //     curr=curr.next;
        // }
        // return false;

        // ListNode Intial=head;

        // ListNode prev=null,curr=head,next;

        // while(curr!=null)
        // {
        //     next=curr.next;
        //     curr.next=prev;

        //     prev=curr;
        //     curr=next;
        // }

        // ListNode tmp=head;

        // if(Intial==tmp)
        // {
        //     return true;
        // }

        // return false;

        
        if(head.next==null || head==null)
        {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode prev = null;
        ListNode curr = slow.next;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }
}