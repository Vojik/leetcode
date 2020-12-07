package com.vojik.solutions;

import static com.vojik.solutions.TestHelper.fromListNodeToArray;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_92Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_92 solution = new Solution_92();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 4, 3, 2, 5});

    // when
    nodes = solution.reverseBetween(nodes, 2, 4);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test2_whenSolution1() {
    // given
    Solution_92 solution = new Solution_92();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3});
    ListNode expected = TestHelper.populateNodes(new int[]{2, 1, 3});

    // when
    nodes = solution.reverseBetween(nodes, 1, 2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test3_whenSolution1() {
    // given
    Solution_92 solution = new Solution_92();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2});
    ListNode expected = TestHelper.populateNodes(new int[]{2, 1});

    // when
    nodes = solution.reverseBetween(nodes, 1, 2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

}