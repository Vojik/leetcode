package com.vojik.solutions;

/**
 * 1748. Sum of Unique Elements
 */
public class Solution_1748 {

  public int sumOfUnique(int[] nums) {
    int[] count = new int[101];
    int sum = 0;
    for (int n : nums) {
      count[n]++;
    }
    for (int i = 1; i < 101; i++) {
      if (count[i] == 1) {
        sum += i;
      }
    }
    return sum;
  }
}
