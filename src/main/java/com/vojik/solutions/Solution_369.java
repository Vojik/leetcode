package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 369. Plus One Linked List
 */
public class Solution_369 {

  /**
   * - reverse - sum - reverse
   */
  public ListNode plusOne(ListNode head) {
    ListNode newHead = reverseList(head);

    ListNode curNode = newHead;
    ListNode prev = null;
    boolean carry = true;
    while (curNode != null && carry) {
      if (curNode.val == 9) {
        curNode.val = 0;
      } else {
        curNode.val++;
        carry = false;
      }
      prev = curNode;
      curNode = curNode.next;
    }
    if (carry) {
      prev.next = new ListNode(1);
    }
    return reverseList(newHead);
  }

  private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
  }

  // From solutions
  // Time: O(N)
  // Space: O(1)
  public ListNode plusOneWithSentinel(ListNode head) {
    // sentinel head
    ListNode sentinel = new ListNode(0);
    sentinel.next = head;
    ListNode notNine = sentinel;

    // find the rightmost not-nine digit
    while (head != null) {
      if (head.val != 9) {
        notNine = head;
      }
      head = head.next;
    }

    // increase this rightmost not-nine digit by 1
    notNine.val++;
    notNine = notNine.next;

    // set all the following nines to zeros
    while (notNine != null) {
      notNine.val = 0;
      notNine = notNine.next;
    }

    return sentinel.val != 0 ? sentinel : sentinel.next;
  }

  public ListNode plusOneRecursively(ListNode head) {
    if (DFS(head) == 0) {
      return head;
    } else {
      ListNode newHead = new ListNode(1);
      newHead.next = head;
      return newHead;
    }
  }

  public int DFS(ListNode head) {
    if (head == null) {
      return 1;
    }

    int carry = DFS(head.next);

    if (carry == 0) {
      return 0;
    }

    int val = head.val + 1;
    head.val = val % 10;
    return val / 10;
  }
}
