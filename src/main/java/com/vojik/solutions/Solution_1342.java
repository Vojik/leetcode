package com.vojik.solutions;

/**
 * 1342. Number of Steps to Reduce a Number to Zero
 */
public class Solution_1342 {

  // Time: O(n*log n) Space: O(1)
  public int numberOfSteps(int num) {
    int output = 0;
    while (num != 0) {
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num--;
      }
      output++;
    }
    return output;
  }
}
