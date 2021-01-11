package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 206. Reverse Linked List
 *
 * <p>Reverse a singly linked list.
 *
 * <p>Example:
 *
 * <p>Input: 1->2->3->4->5->NULL Output: 5->4->3->2->1->NULL Follow up:
 *
 * <p>A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Solution_206 {

  // Time: O(n) Space: O(1)
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode current = head;
    ListNode temp;
    while (current.next != null) {
      temp = current.next;
      current.next = current.next.next;
      temp.next = head;
      head = temp;
    }
    return head;
  }

  // Time: O(n) Space: O(n)
  public ListNode reverseListRecursively(ListNode head) {
    return helper(head, null);
  }

  private ListNode helper(ListNode head, ListNode previous) {
    if (head == null) {
      return previous;
    }

    ListNode temp = head.next;
    head.next = previous;
    return helper(temp, head);
  }
}
