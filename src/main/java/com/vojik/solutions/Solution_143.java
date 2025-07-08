package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 143. Reorder List
 */
public class Solution_143 {

  public void reorderList(ListNode head) {
    Deque<ListNode> deque = new ArrayDeque<>();
    ListNode cursor = head;
    while (cursor != null) {
      ListNode nextCursor = cursor.next;
      cursor.next = null;
      deque.addLast(cursor);
      cursor = nextCursor;
    }

    ListNode dummy = new ListNode();
    cursor = dummy;
    while (!deque.isEmpty()) {
      cursor.next = deque.removeFirst();
      cursor = cursor.next;

      if (!deque.isEmpty()) {
        cursor.next = deque.removeLast();
        cursor = cursor.next;
      }
    }
    dummy.next = null;
  }
}
