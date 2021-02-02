package com.vojik.solutions;

/**
 * 191. Number of 1 Bits
 */
public class Solution_191 {

  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int ones = 0;
    int mask = 1;
    while (n != 0) {
      ones += (n & mask);
      n >>>= 1;
    }
    return ones;
  }

}
