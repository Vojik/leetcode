package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_981Test {

  @Test
  public void test_whenSolution() {
    Solution_981 sol = new Solution_981();
    sol.set("foo", "bar", 1);
    assertEquals("bar", sol.get("foo", 1));
    assertEquals("bar", sol.get("foo", 3));
    sol.set("foo", "bar2", 4);
    assertEquals("bar2", sol.get("foo", 4));
    assertEquals("bar2", sol.get("foo", 5));
    assertEquals("bar", sol.get("foo", 2));
    assertEquals("bar", sol.get("foo", 1));
  }

}