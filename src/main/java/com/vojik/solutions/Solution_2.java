package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 2. Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are
 * stored in reverse order and each of their nodes contain a single digit. Add the two numbers and
 * return it as a linked list.
 *
 * <p>You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * <p>Example:
 *
 * <p>Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 + 465 = 807.
 */
public class Solution_2 {

  public static ListNode solution1(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode node = new ListNode();
    ListNode head = node;
    while (l1 != null || l2 != null) {
      int x = l1 != null ? l1.val : 0;
      int y = l2 != null ? l2.val : 0;
      int sum = x + y + carry;
      carry = sum / 10;
      node.next = new ListNode(sum % 10);
      node = node.next;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (carry > 0) {
      node.next = new ListNode(carry);
    }
    return head.next;
  }
}
