package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_2Test {

  @Test
  public void test1_whenSolution1() {
    ListNode firstNode = populateNodes(new int[]{2, 4, 3});
    ListNode secondNode = populateNodes(new int[]{5, 6, 4});
    int[] expectedResult = new int[]{7, 0, 8};

    ListNode actualListNode = Solution_2.solution1(firstNode, secondNode);

    Assertions.assertArrayEquals(expectedResult, fromListNodeToArray(actualListNode));
  }

  @Test
  public void test2_whenSolution1() {
    ListNode firstNode = populateNodes(new int[]{1, 8});
    ListNode secondNode = populateNodes(new int[]{0});
    int[] expectedResult = new int[]{1, 8};

    ListNode actualListNode = Solution_2.solution1(firstNode, secondNode);

    Assertions.assertArrayEquals(expectedResult, fromListNodeToArray(actualListNode));
  }

  @Test
  public void test3_whenSolution1() {
    ListNode firstNode = populateNodes(new int[]{2, 4, 8});
    ListNode secondNode = populateNodes(new int[]{5, 6, 4});
    int[] expectedResult = new int[]{7, 0, 3, 1};

    ListNode actualListNode = Solution_2.solution1(firstNode, secondNode);

    Assertions.assertArrayEquals(expectedResult, fromListNodeToArray(actualListNode));
  }


  private static ListNode populateNodes(int[] values) {
    ListNode result = new ListNode(0);

    ListNode current = result;
    for (int value : values) {
      current.next = new ListNode(value);
      current = current.next;
    }
    return result.next;
  }

  private static int[] fromListNodeToArray(ListNode listNode) {
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