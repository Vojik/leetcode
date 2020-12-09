package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 21. Merge Two Sorted Lists
 *
 * <p>Merge two sorted linked lists and return it as a new sorted list. The new list should be made
 * by splicing together the nodes of the first two lists.
 *
 * <p>Example 1:
 * <p>Input: l1 = [1,2,4], l2 = [1,3,4] Output: [1,1,2,3,4,4]
 * <p>
 * Example 2:
 * <p>Input: l1 = [], l2 = [] Output: []
 * <p>
 * Example 3:
 * <p>Input: l1 = [], l2 = [0] Output: [0]
 *
 * <p>Constraints:
 * <p>The number of nodes in both lists is in the range [0, 50]. -100 <= Node.val <= 100 Both l1
 * and l2 are sorted in non-decreasing order.
 */
public class Solution_21 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    return l1.val < l2.val ? merge(l1, l2) : merge(l2, l1);
  }

  private ListNode merge(ListNode primary, ListNode secondary) {

    ListNode primaryHead = primary;
    primary = primary.next;
    ListNode previous = primaryHead;
    while (primary != null && secondary != null) {
      if (primary.val < secondary.val) {
        previous.next = primary;
        primary = primary.next;
      } else {
        previous.next = secondary;
        secondary = secondary.next;
      }
      previous = previous.next;
    }

    while (primary != null) {
      previous.next = primary;
      primary = primary.next;
      previous = previous.next;
    }

    while (secondary != null) {
      previous.next = secondary;
      secondary = secondary.next;
      previous = previous.next;
    }

    return primaryHead;
  }
}
