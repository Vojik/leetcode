package com.vojik.solutions;

import com.vojik.helpers.ListNode;

public class Solution_24 {

  // Time: O(n) Space: O(1)
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode result = head.next;
    head.next = result.next;
    result.next = head;

    swap(head.next, head);
    return result;
  }

  private void swap(ListNode head, ListNode previous) {
    if (head == null || head.next == null) {
      return;
    }

    ListNode temp = head.next;
    head.next = head.next.next;
    temp.next = head;
    previous.next = temp;

    swap(head.next, head);
  }

  // Time: O(n) Space: O(1)
  public ListNode swapPairs2(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    swap(head);
    return head;
  }

  private void swap(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    int temp = head.val;
    head.val = head.next.val;
    head.next.val = temp;
    swap(head.next.next);
  }

}
