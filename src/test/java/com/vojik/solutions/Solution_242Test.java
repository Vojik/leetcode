package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_242Test {

  @Test
  public void test_whenSolution1() {
    assertTrue(new Solution_242().isAnagram("anagram", "nagaram"));
    assertFalse(new Solution_242().isAnagram("rat", "cat"));
  }

}