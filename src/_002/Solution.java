package _002;

import java.util.List;

/**
 * 2. Add Two Numbers
 * Medium
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * <p>
 * <p>
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //if (l1 != null) {
        //    addTwoNumbers(l1.next, l2);
        //    System.out.println(l1.val);
        //}
        //System.out.println();
        //if (l2 != null) {
        //    addTwoNumbers(l1 , l2.next);
        //    System.out.println(l2.val);
        //}

        ListNode currentl1 = l1;
        ListNode currentl2 = l2;
        int carry = 0;
        int sum = 0;
        ListNode root = null;
        ListNode currentNode=null;
        while (currentl1 != null || currentl2 != null) {
            int d1 =currentl1==null?0: currentl1.val;
            int d2 =currentl2==null?0: currentl2.val;
            sum = d1 + d2 + carry;
            carry = sum / 10;
            sum %= 10;

            if (root == null) {
                root = new ListNode(sum);
                currentNode = root;
            } else {
                currentNode.next = new ListNode(sum);
                currentNode=currentNode.next;
                //root.next = currentNode;
            }

            //System.out.println(sum);

            currentl1 = currentl1==null?null:currentl1.next;
            currentl2 = currentl2==null?null:currentl2.next;

        }

        if(carry!=0){
            currentNode.next = new ListNode(carry);
        }

        currentNode = root;
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }

        return root;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(8);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        new Solution().addTwoNumbers(l1, l2);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}