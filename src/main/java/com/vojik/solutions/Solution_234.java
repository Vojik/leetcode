package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 234. Palindrome Linked List
 */
public class Solution_234 {

  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }

    // Find middle
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // reverse the second half
    ListNode reversedHead = reverseListNode(slow.next);

    // traverse with 2 pointers
    while (reversedHead != null) {
      if (reversedHead.val != head.val) {
        return false;
      }
      reversedHead = reversedHead.next;
      head = head.next;
    }
    return true;
  }

  private ListNode reverseListNode(ListNode head) {
    ListNode nextNode;
    ListNode reversedHead = head;
    while (head != null && head.next != null) {
      nextNode = head.next;
      head.next = head.next.next;
      nextNode.next = reversedHead;
      reversedHead = nextNode;
    }
    return reversedHead;
  }
}
