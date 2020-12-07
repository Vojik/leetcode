package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 203. Remove Linked List Elements
 *
 * <p>Remove all elements from a linked list of integers that have value val.
 *
 * <p>Example:
 *
 * <p>Input: 1->2->6->3->4->5->6, val = 6 Output: 1->2->3->4->5
 */
public class Solution_203 {

  public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
      head = head.next;
    }

    ListNode cur = head;
    while (cur != null) {

      if (cur.next != null && cur.next.val == val) {
        ListNode temp = cur.next.next;
        while (temp != null && temp.val == val) {
          temp = temp.next;
        }
        cur.next = temp;
      }

      cur = cur.next;
    }

    return head;
  }
}
