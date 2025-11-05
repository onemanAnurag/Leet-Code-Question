/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int len1 =0, len2=0;
        while(headA!=null){
            headA = headA.next;
            len1++;
        }
           while(headB!=null){
                 headB = headB.next;
            len2++;
        }
        if(len1>len2){
            for(int i=1;i<=(len1-len2);i++){
                temp1 = temp1.next;
            }

         
        }
        else{
                for(int i=1;i<=(len2-len1);i++){
                   temp2 = temp2.next;
            }
             
        }
         while(temp1!=temp2){
                 temp1=temp1.next;
                temp2 = temp2.next;
         }
         return temp1;
    }
}