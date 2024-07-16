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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        int carry = 0;
        while(l1 != null || l2 != null || carry > 0 ){
            int dig1 = 0;
            int dig2 = 0;
            if(l1 != null){
                dig1 = l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                dig2 = l2.val;
                l2 = l2.next;
            }

            int sum = dig1 + dig2 + carry;
            int dig = sum % 10;
            carry = sum / 10;

            ListNode n = new ListNode(dig);
            temp.next = n;
            temp = temp.next;
        }


        return ans.next;
    }
}