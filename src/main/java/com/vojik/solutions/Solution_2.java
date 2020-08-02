package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
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
    ListNode result = new ListNode(0);
    ListNode cur1 = l1;
    ListNode cur2 = l2;
    ListNode current = result;
    int carry = 0;

    while (cur1 != null || cur2 != null) {
      int sum = carry;
      if (cur1 != null) {
        sum += cur1.val;
      }
      if (cur2 != null) {
        sum += cur2.val;
      }

      carry = sum / 10;
      current.next = new ListNode(sum % 10);

      // Moving
      current = current.next;
      if (cur1 != null) {
        cur1 = cur1.next;
      }
      if (cur2 != null) {
        cur2 = cur2.next;
      }
    }
    if (carry == 1) {
      current.next = new ListNode(1);
    }

    return result.next;
  }
}
