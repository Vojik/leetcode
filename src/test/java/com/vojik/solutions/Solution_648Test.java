package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_648Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("the cat was rat by the bat", new Solution_648()
        .replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("a a b c", new Solution_648()
        .replaceWords(List.of("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("a a a a a a a a bbb baba a", new Solution_648()
        .replaceWords(List.of("a", "aa", "aaa", "aaaa"),
            "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals("the cat was rat by the bat", new Solution_648()
        .replaceWords(List.of("catt", "cat", "bat", "rat"),
            "the cattle was rattled by the battery"));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals("it is ab that this solution is ac", new Solution_648()
        .replaceWords(List.of("ac", "ab"), "it is abnormal that this solution is accepted"));
  }
}