package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_744Test {

  @Test
  public void test1_whenSolution1() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a');
    assertEquals('c', actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');
    assertEquals('f', actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd');
    assertEquals('f', actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g');
    assertEquals('j', actual);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j');
    assertEquals('c', actual);
  }

  @Test
  public void test6_whenSolution1() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k');
    assertEquals('c', actual);
  }

  @Test
  public void test7_whenSolution1() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter(new char[]{'e','e','e','e','e','e','n','n','n','n'}, 'e');
    assertEquals('n', actual);
  }

  ////////////////////////////////////

  @Test
  public void test1_whenSolution2() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetterOptimal(new char[]{'c', 'f', 'j'}, 'a');
    assertEquals('c', actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetterOptimal(new char[]{'c', 'f', 'j'}, 'c');
    assertEquals('f', actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetterOptimal(new char[]{'c', 'f', 'j'}, 'd');
    assertEquals('f', actual);
  }

  @Test
  public void test4_whenSolution2() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetterOptimal(new char[]{'c', 'f', 'j'}, 'g');
    assertEquals('j', actual);
  }

  @Test
  public void test5_whenSolution2() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetterOptimal(new char[]{'c', 'f', 'j'}, 'j');
    assertEquals('c', actual);
  }

  @Test
  public void test6_whenSolution2() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetterOptimal(new char[]{'c', 'f', 'j'}, 'k');
    assertEquals('c', actual);
  }

  @Test
  public void test7_whenSolution2() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetterOptimal(new char[]{'e','e','e','e','e','e','n','n','n','n'}, 'e');
    assertEquals('n', actual);
  }


  ////////////////////////////////////

  @Test
  public void test1_whenSolution3() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter2(new char[]{'c', 'f', 'j'}, 'a');
    assertEquals('c', actual);
  }

  @Test
  public void test2_whenSolution3() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter2(new char[]{'c', 'f', 'j'}, 'c');
    assertEquals('f', actual);
  }

  @Test
  public void test3_whenSolution3() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter2(new char[]{'c', 'f', 'j'}, 'd');
    assertEquals('f', actual);
  }

  @Test
  public void test4_whenSolution3() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter2(new char[]{'c', 'f', 'j'}, 'g');
    assertEquals('j', actual);
  }

  @Test
  public void test5_whenSolution3() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter2(new char[]{'c', 'f', 'j'}, 'j');
    assertEquals('c', actual);
  }

  @Test
  public void test6_whenSolution3() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter2(new char[]{'c', 'f', 'j'}, 'k');
    assertEquals('c', actual);
  }

  @Test
  public void test7_whenSolution3() {
    Solution_744 solution = new Solution_744();
    char actual = solution.nextGreatestLetter2(new char[]{'e','e','e','e','e','e','n','n','n','n'}, 'e');
    assertEquals('n', actual);
  }
}