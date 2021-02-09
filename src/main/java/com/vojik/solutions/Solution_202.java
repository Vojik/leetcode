package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 */
public class Solution_202 {

  public boolean isHappy(int n) {
    Set<Integer> seen = new HashSet<>();
    seen.add(n);

    while (n != 1) {
      n = helper(n);
      if (seen.contains(n)) {
        return false;
      }
      seen.add(n);
    }
    return true;
  }

  private int helper(int n) {
    int sum = 0;
    while (n != 0) {
      sum += Math.pow(n % 10, 2);
      n = n / 10;
    }
    return sum;
  }
}
