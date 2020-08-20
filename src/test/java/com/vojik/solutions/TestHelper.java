package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import java.util.ArrayList;
import java.util.List;

public class TestHelper {

  public static ListNode populateNodes(int[] values) {
    ListNode result = new ListNode(0);

    ListNode current = result;
    for (int value : values) {
      current.next = new ListNode(value);
      current = current.next;
    }
    return result.next;
  }

  public static int[] fromListNodeToArray(ListNode listNode) {
    ListNode cur = listNode;
    List<Integer> list = new ArrayList<>();
    while (cur != null) {
      list.add(cur.val);
      cur = cur.next;
    }

    int[] result = new int[list.size()];
    for (int i = 0, listSize = list.size(); i < listSize; i++) {
      result[i] = list.get(i);
    }
    return result;
  }

}
