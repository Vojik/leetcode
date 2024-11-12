package com.vojik.solutions;

/** 1512. Number of Good Pairs */
public class Solution_1512 {

  public int numIdenticalPairs(int[] nums) {
    int[] occurances = new int[101];
    int result = 0;
    for (int num : nums) {
      result += occurances[num];
      occurances[num]++;
    }
    return result;
  }
}
