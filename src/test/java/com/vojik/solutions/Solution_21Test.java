package com.vojik.solutions;

import static com.vojik.solutions.TestHelper.fromListNodeToArray;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_21Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_21 solution = new Solution_21();
    ListNode l1 = TestHelper.populateNodes(new int[]{1, 2, 4});
    ListNode l2 = TestHelper.populateNodes(new int[]{1, 3, 4});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 1, 2, 3, 4, 4});

    // when
    ListNode actual = solution.mergeTwoLists(l1, l2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(actual));
  }

  @Test
  public void test2_whenSolution1() {
    // given
    Solution_21 solution = new Solution_21();
    ListNode l1 = TestHelper.populateNodes(new int[]{1});
    ListNode l2 = TestHelper.populateNodes(new int[]{1, 3, 4});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 1, 3, 4});

    // when
    ListNode actual = solution.mergeTwoLists(l1, l2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(actual));
  }

  @Test
  public void test3_whenSolution1() {
    // given
    Solution_21 solution = new Solution_21();
    ListNode l1 = TestHelper.populateNodes(new int[]{});
    ListNode l2 = TestHelper.populateNodes(new int[]{1, 3, 4});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 3, 4});

    // when
    ListNode actual = solution.mergeTwoLists(l1, l2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(actual));
  }

  @Test
  public void test4_whenSolution1() {
    // given
    Solution_21 solution = new Solution_21();
    ListNode l1 = TestHelper.populateNodes(new int[]{1, 3, 4});
    ListNode l2 = TestHelper.populateNodes(new int[]{});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 3, 4});

    // when
    ListNode actual = solution.mergeTwoLists(l1, l2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(actual));
  }

  @Test
  public void test5_whenSolution1() {
    // given
    Solution_21 solution = new Solution_21();
    ListNode l1 = TestHelper.populateNodes(new int[]{1, 2, 4, 5, 6, 7, 8, 9});
    ListNode l2 = TestHelper.populateNodes(new int[]{1, 3, 4});
    ListNode expected = TestHelper.populateNodes(new int[]{1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9});

    // when
    ListNode actual = solution.mergeTwoLists(l1, l2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(actual));
  }
}