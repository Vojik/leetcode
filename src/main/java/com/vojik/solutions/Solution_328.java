package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 328. Odd Even Linked List
 *
 * <p>Given a singly linked list, group all odd nodes together followed by the even nodes. Please
 * note here we are talking about the node number and not the value in the nodes.
 *
 * <p>You should try to do it in place. The program should run in O(1) space complexity and
 * O(nodes) time complexity.
 *
 * <p>Example 1:
 *
 * <p>Input: 1->2->3->4->5->NULL Output: 1->3->5->2->4->NULL
 * <p>
 * <p>
 * Example 2:
 *
 * <p>Input: 2->1->3->5->6->4->7->NULL Output: 2->3->6->7->1->5->4->NULL
 *
 * <p>Constraints:
 *
 * <p>The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ... The length of the linked
 * list is between [0, 10^4].
 */
public class Solution_328 {

  // Time: O(n) Space: O(1)
  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode oddCursor = head;

    ListNode evenStart = head.next;
    ListNode evenCursor = evenStart;

    ListNode cursor = evenStart.next;
    int idx = 3; // cursor's index

    while (cursor != null) {
      if (idx % 2 == 0) { // even
        evenCursor.next = cursor;
        evenCursor = evenCursor.next;
      } else { // odd
        oddCursor.next = cursor;
        oddCursor = oddCursor.next;
      }
      idx++;
      cursor = cursor.next;
    }

    // Avoid a cycle in the ListNode
    if (idx % 2 == 0) {
      evenCursor.next = null;
    } else {
      oddCursor.next = null;
    }

    // Link odd elements with even
    oddCursor.next = evenStart;

    return head;
  }

  public ListNode oddEvenList2(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode oddCursor = head;
    ListNode evenStart = head.next;
    ListNode evenCursor = evenStart;

    while (evenCursor != null && evenCursor.next != null) {
      oddCursor.next = evenCursor.next;
      oddCursor = oddCursor.next;
      evenCursor.next = oddCursor.next;
      evenCursor = evenCursor.next;
    }

    // Link odd elements with even
    oddCursor.next = evenStart;

    return head;
  }
}
