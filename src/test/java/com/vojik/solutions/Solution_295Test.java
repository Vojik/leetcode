package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_295Test {

  @Test
  public void test1_whenSolution1() {
    Solution_295 medianFinder = new Solution_295();
    medianFinder.addNum(1);    // arr = [1]
    medianFinder.addNum(2);    // arr = [1, 2]
    Assertions.assertEquals(1.5, medianFinder.findMedian());
    medianFinder.addNum(3);    // arr[1, 2, 3]
    Assertions.assertEquals(2.0, medianFinder.findMedian());
  }

}