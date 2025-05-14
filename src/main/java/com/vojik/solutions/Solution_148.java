package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import java.util.PriorityQueue;

/**
 * 148. Sort List
 */
public class Solution_148 {

  public ListNode sortList(ListNode head) {
    PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

    ListNode cur = head;
    while (cur != null) {
      ListNode next = cur.next;
      cur.next = null;
      pq.add(cur);
      cur = next;
    }

    ListNode dummyNode = new ListNode();
    ListNode current = dummyNode;
    while (!pq.isEmpty()) {
      ListNode nextNode = pq.poll();
      current.next = nextNode;
      current = nextNode;
    }
    return dummyNode.next;
  }
}