package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 141. Linked List Cycle
 *
 * <p>Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * <p>There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer. Internally, pos is used to denote the index of the
 * node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * <p>Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * <p>Constraints:
 *
 * <p>The number of the nodes in the list is in the range [0, 104]. -105 <= Node.val <= 105 pos is
 * -1 or a valid index in the linked-list.
 */
public class Solution_141 {

  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    ListNode slowPointer = head;
    ListNode fastPointer = head;

    while (true) {
      if (fastPointer.next == null || fastPointer.next.next == null) {
        return false;
      }
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
      if (slowPointer == fastPointer) {
        return true;
      }
    }
  }
}
