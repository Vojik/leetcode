package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import java.util.HashMap;
import java.util.Map;

/** 1171. Remove Zero Sum Consecutive Nodes from Linked List */
public class Solution_1171 {

  public ListNode removeZeroSumSublists(ListNode head) {
    ListNode dummy = new ListNode();
    dummy.next = head;
    int sum = 0;
    Map<Integer, ListNode> map = new HashMap<>();
    map.put(0, dummy);
    ListNode current = head;
    while (current != null) {
      sum += current.val;
      ListNode node = map.get(sum);
      if (node != null) {
        current = node.next;
        int p = sum + current.val;
        while (p != sum) {
          map.remove(p);
          current = current.next;
          p += current.val;
        }
        node.next = current.next;
      } else {
        map.put(sum, current);
      }
      current = current.next;
    }
    return dummy.next;
  }
}
