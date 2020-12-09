package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Test;

class Solution_234Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_234 solution = new Solution_234();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 2, 1});

    // when
    boolean actual = solution.isPalindrome(nodes);

    // then
    assertTrue(actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_234 solution = new Solution_234();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 1, 2, 1});
    boolean actual = solution.isPalindrome(nodes);
    assertFalse(actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_234 solution = new Solution_234();
    ListNode nodes = TestHelper.populateNodes(new int[]{1});
    boolean actual = solution.isPalindrome(nodes);
    assertTrue(actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_234 solution = new Solution_234();
    ListNode nodes = TestHelper.populateNodes(new int[]{});
    boolean actual = solution.isPalindrome(nodes);
    assertTrue(actual);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_234 solution = new Solution_234();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 1});
    boolean actual = solution.isPalindrome(nodes);
    assertTrue(actual);
  }

  @Test
  public void test6_whenSolution1() {
    Solution_234 solution = new Solution_234();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 4, -1, -1, 4, 1});
    boolean actual = solution.isPalindrome(nodes);
    assertTrue(actual);
  }


}