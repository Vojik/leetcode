package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 92. Reverse Linked List II
 *
 * <p>Reverse a linked list from position m to n. Do it in one-pass.
 *
 * <p>Note: 1 ≤ m ≤ n ≤ length of list.
 *
 * <p>Example:
 *
 * <p>Input: 1->2->3->4->5->NULL, m = 2, n = 4 Output: 1->4->3->2->5->NULL
 */
public class Solution_92 {

  public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null) {
      return null;
    }

    ListNode current = head;
    ListNode lastNode = current;
    for (int i = 1; i < m; i++) {
      lastNode = current;
      current = current.next;
    }

    ListNode smallHead = current;
    ListNode temp;
    for (int i = m; i < n && smallHead.next != null; i++) {
      temp = current.next;
      current.next = temp.next;
      temp.next = smallHead;
      smallHead = temp;
    }

    if (lastNode != smallHead && m != 1) {
      lastNode.next = smallHead;
    }

    return m == 1 ? smallHead : head;
  }

}
