package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 1721. Swapping Nodes in a Linked List
 */
public class Solution_1721 {

  // Time: O(N)
  // Space: O(1)
  public ListNode swapNodes(ListNode head, int k) {
    ListNode cursor = head;
    ListNode first = head;
    ListNode second = null;
    while (cursor != null) {
      second = second != null ? second.next : null;
      if (--k == 0) {
        first = cursor;
        second = head;
      }
      cursor = cursor.next;
    }

    int temp = first.val;
    first.val = second.val;
    second.val = temp;
    return head;
  }
}
