package com.vojik.solutions;

import com.vojik.helpers.ListNode;

/**
 * 19. Remove Nth Node From End of List
 *
 * <p>Given the head of a linked list, remove the nth node from the end of the list and return its
 * head.
 *
 * <p>Follow up: Could you do this in one pass?
 *
 * <p>Example 1:
 *
 * <p>Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5] Example 2:
 *
 * <p>Input: head = [1], n = 1 Output: [] Example 3:
 *
 * <p>Input: head = [1,2], n = 1 Output: [1]
 *
 * <p>Constraints:
 *
 * <p>The number of nodes in the list is sz. 1 <= sz <= 30 0 <= Node.val <= 100 1 <= n <= sz
 */
public class Solution_19 {

  // Time: O(n) Space: O()
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head.next == null && n == 1) {
      return null;
    }

    ListNode slow = head;
    ListNode fast = head;
    int fastIdx = 0;
    int idxToDelete = -1;

    // 1. Find index to delete
    while (true) {
      if (fast.next == null) { // odd num of elements
        idxToDelete = fastIdx + 1 - n; // idxToDelete = len - n => idxToDelete = fastIdx + 1 - n
        break;
      }

      if (fast.next.next == null) { // even num of elements
        idxToDelete = fastIdx + 2 - n; // idxToDelete = len + 1 - n => idxToDelete = fastIdx + 2 - n
        break;
      }
      slow = slow.next;
      fast = fast.next.next;
      fastIdx += 2;
    }

    // Corner case
    if (idxToDelete == 0) {
      return head.next;
    }

    // 2. Go to previous element
    int slowIdx = fastIdx / 2;
    if (idxToDelete <= slowIdx) {
      // go from head to idxToDel - 1 (previous element)
      slowIdx = 0;
      slow = head;
    }
    // continue from slowIdx to idxToDel - 1 (previous element)
    while (slowIdx < idxToDelete - 1) {
      slow = slow.next;
      slowIdx++;
    }

    // 3. Delete next element
    slow.next = slow.next.next;

    return head;
  }

  // optimal
  public ListNode removeNthFromEnd2(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;

    for (int i = 1; i <= n + 1; i++) {
      first = first.next;
    }

    while (first != null) {
      first = first.next;
      second = second.next;
    }
    second.next = second.next.next;

    return dummy.next;

  }
}