package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 61. Rotate List
 *
 * <p>Given the head of a linked list, rotate the list to the right by k places.
 *
 * <p>Example 1:
 * <p>Input: head = [1,2,3,4,5], k = 2 Output: [4,5,1,2,3]
 * <p>
 * Example 2:
 * <p>Input: head = [0,1,2], k = 4 Output: [2,0,1]
 *
 * <p>Constraints:
 *
 * <p>The number of nodes in the list is in the range [0, 500]. -100 <= Node.val <= 100 0 <= k <= 2
 * * 109
 */
public class Solution_61 {

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null) {
      return null;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode fastPrev = dummy;
    ListNode slow = dummy;
    int length = 0;
    int slowIdx = 0;

    // Find middle and length
    while (fast != null && fast.next != null) {
      length += 2;
      slowIdx++;
      slow = slow.next;
      fastPrev = fast.next;
      fast = fast.next.next;
    }
    if (fast == null) {
      fast = fastPrev;
      length--;
    }

    // idx of last element in new list
    int tailIdx = length - (k % length);
    if (tailIdx == length) {
      return head;
    }

    if (tailIdx < slowIdx) {
      slow = head;
      slowIdx = 1;
    }

    while (slowIdx != tailIdx) {
      slow = slow.next;
      slowIdx++;
    }

    ListNode newHead = slow.next;
    slow.next = null;
    fast.next = head;

    return newHead;
  }
}
