package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_524Test {

  @Test
  public void test1_whenSolution1() {
    String actual = new Solution_524()
        .findLongestWord("abpcplea", List.of("ale", "apple", "monkey", "plea"));
    Assertions.assertEquals("apple", actual);
  }

  @Test
  public void test2_whenSolution1() {
    String actual = new Solution_524().findLongestWord("abpcplea", List.of("a", "b", "c"));
    Assertions.assertEquals("a", actual);
  }

}