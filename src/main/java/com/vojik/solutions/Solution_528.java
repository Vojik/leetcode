package com.vojik.solutions;

/** 528. Random Pick with Weight */
public class Solution_528 {
  private int[] prefixSums;
  private int totalSum;

  public Solution_528(int[] w) {
    this.prefixSums = new int[w.length];

    int sum = 0;
    for (int i = 0; i < w.length; i++) {
      sum += w[i];
      prefixSums[i] = sum;
    }
    this.totalSum = sum;
  }

  public int pickIndex() {
    int left = 0;
    int right = prefixSums.length - 1;

    double target = totalSum * Math.random();

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (target > prefixSums[mid]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
