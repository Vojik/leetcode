package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import java.util.HashSet;
import java.util.Set;

/**
 * 142. Linked List Cycle II
 *
 * <p>Given a linked list, return the node where the cycle begins. If there is no cycle, return
 * null.
 *
 * <p>There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer. Internally, pos is used to denote the index of the
 * node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * <p>Notice that you should not modify the linked list.
 *
 * <p>Example 1:
 *
 * <p>Input: head = [3,2,0,-4], pos = 1 Output: tail connects to node index 1 Explanation: There is
 * a cycle in the linked list, where tail connects to the second node.
 *
 * <p>Example 2:
 *
 * <p>Input: head = [1,2], pos = 0 Output: tail connects to node index 0 Explanation: There is a
 * cycle in the linked list, where tail connects to the first node.
 *
 * <p>Example 3:
 *
 * <p>Input: head = [1], pos = -1 Output: no cycle Explanation: There is no cycle in the linked
 * list.
 *
 * <p>Constraints:
 *
 * <p>The number of the nodes in the list is in the range [0, 104]. -105 <= Node.val <= 105 pos is
 * -1 or a valid index in the linked-list.
 *
 * <p>Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */
public class Solution_142 {


  // Time: O(n) Space: O(1)
  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }

    ListNode starter = head;
    ListNode slowPointer = head;
    ListNode fastPointer = head;

    while (fastPointer.next != null && fastPointer.next.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
      if (slowPointer == fastPointer) {
        while (slowPointer != starter) {
          slowPointer = slowPointer.next;
          starter = starter.next;
        }
        return starter;
      }
    }
    return null;
  }

  // Time: O(n) Space: O(n)
  public ListNode detectCycle2(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode node = head;
    Set<ListNode> set = new HashSet<>();
    while (node != null) {
      if (set.contains(node)) {
        return node;
      } else {
        set.add(node);
        node = node.next;
      }
    }
    return null;
  }

}
