package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 */
public class Solution_23 {

  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) -> a.val - b.val);
    for (ListNode node : lists) {
      if (node != null) {
        minHeap.add(node);
      }
    }

    ListNode head = new ListNode();
    ListNode cur = head;
    while (!minHeap.isEmpty()) {
      ListNode n = minHeap.poll();
      if (n.next != null) {
        minHeap.add(n.next);
      }
      cur.next = n;
      cur = cur.next;
    }
    return head.next;
  }
}
