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

//递归算法

class Solution {
    private ListNode qjzhizhen;  //全局变量
    public boolean newPalindrome(ListNode truenode){ 
        if(truenode != null){
            if(!newPalindrome(truenode.next)){
                return false;
                // 调用递归方法，将下一个节点传入
            }
            if(truenode.val != qjzhizhen.val){
                return false;
            }
        qjzhizhen = qjzhizhen.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        qjzhizhen = head;
        return newPalindrome(head);
    }
}