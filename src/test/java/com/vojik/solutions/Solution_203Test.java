package com.vojik.solutions;

import static com.vojik.solutions.TestHelper.fromListNodeToArray;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_203Test {


  @Test
  public void test1_whenSolution1() {
    // given
    Solution_203 solution = new Solution_203();
    ListNode nodes = TestHelper.populateNodes(new int[]{6, 6, 6, 1, 2, 6, 3, 4, 5, 6, 6, 6});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5});

    // when
    nodes = solution.removeElements(nodes, 6);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }
}