package com.vojik.solutions;

import static com.vojik.solutions.TestHelper.fromListNodeToArray;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_328Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_328 solution = new Solution_328();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 3, 5, 2, 4});

    // when
    solution.oddEvenList(nodes);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test1_whenSolution2() {
    // given
    Solution_328 solution = new Solution_328();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 3, 5, 2, 4});

    // when
    solution.oddEvenList2(nodes);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }
}