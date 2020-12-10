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
    ListNode current = result;
    int carry = 0;

    while (l1 != null || l2 != null) {
      int sum = carry;
      if (l1 != null) {
        sum += l1.val;
      }
      if (l2 != null) {
        sum += l2.val;
      }

      carry = sum / 10;
      current.next = new ListNode(sum % 10);

      // Moving
      current = current.next;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (carry == 1) {
      current.next = new ListNode(1);
    }

    return result.next;
  }
}
