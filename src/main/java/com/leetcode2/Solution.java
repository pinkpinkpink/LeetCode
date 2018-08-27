package com.leetcode2;

public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        ;
        if (l2 == null) {
            return l1;
        }
        ;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode l3 = new ListNode(0);
        ListNode p3 = l3;
        int carry = 0;
        int sum;
        while(p1 != null && p2 != null){
            sum = p1.val + p2.val +carry;
            p1.val = sum % 10;
            carry  = sum / 10;
            l3.next = p1;
            l3 = p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p1 == null){
            p1.next = p2;
        }else{
            p1.next =p1;
        }
        if(carry == 1){
            while (l3.next != null){
                sum = l3.next.val + carry;
                l3.next.val = sum % 10;
                carry = sum / 10;
                l3 = l3.next;
            }
        }
        if(carry == 1){
            l3.next = new ListNode(1);

        }
        return l3.next;
    }
}
