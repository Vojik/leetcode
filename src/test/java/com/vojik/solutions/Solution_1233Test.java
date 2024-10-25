package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1233Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(List.of("/a", "/c/d", "/c/f"),
        new Solution_1233().removeSubfolders(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(List.of("/a"),
        new Solution_1233().removeSubfolders(new String[]{"/a", "/a/b/c", "/a/b/d"}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(List.of("/a/b/c", "/a/b/d", "/a/b/ca"),
        new Solution_1233().removeSubfolders(new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"}));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertEquals(List.of("/a/a", "/a/ab"),
        new Solution_1233().removeSubfolders(new String[]{"/a/a", "/a/ab"}));
  }

  @Test
  public void test5_whenSolution1() {
    Assertions.assertEquals(List.of("/a", "/ab/a"),
        new Solution_1233().removeSubfolders(new String[]{"/a", "/ab/a"}));
  }

}