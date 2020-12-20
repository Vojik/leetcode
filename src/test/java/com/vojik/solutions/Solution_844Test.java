package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_844Test {

  @Test
  public void tests_whenSolution1() {
    Assertions.assertTrue(new Solution_844().backspaceCompare1("ab#c", "ad#c"));
    Assertions.assertTrue(new Solution_844().backspaceCompare1("ab##", "c#d#"));
    Assertions.assertTrue(new Solution_844().backspaceCompare1("a##c", "#a#c"));
    Assertions.assertFalse(new Solution_844().backspaceCompare1("a#c", "b"));
    Assertions.assertTrue(new Solution_844().backspaceCompare1("y#fo##f", "y#f#o##f"));
    Assertions.assertFalse(new Solution_844().backspaceCompare1("bxj##tw", "bxj###tw"));
    Assertions.assertFalse(new Solution_844().backspaceCompare1("bbbextm", "bbb#extm"));
  }

  @Test
  public void tests_whenSolution2() {
    Assertions.assertTrue(new Solution_844().backspaceCompare2("ab#c", "ad#c"));
    Assertions.assertTrue(new Solution_844().backspaceCompare2("ab##", "c#d#"));
    Assertions.assertTrue(new Solution_844().backspaceCompare2("a##c", "#a#c"));
    Assertions.assertFalse(new Solution_844().backspaceCompare2("a#c", "b"));
    Assertions.assertTrue(new Solution_844().backspaceCompare2("y#fo##f", "y#f#o##f"));
    Assertions.assertFalse(new Solution_844().backspaceCompare2("bxj##tw", "bxj###tw"));
    Assertions.assertFalse(new Solution_844().backspaceCompare2("bbbextm", "bbb#extm"));
  }

}