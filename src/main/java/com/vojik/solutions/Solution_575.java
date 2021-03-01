package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. Distribute Candies
 */
public class Solution_575 {

  // Time: O(n) Space: O(n)
  public int distributeCandies(int[] candyType) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < candyType.length && set.size() < candyType.length / 2; i++) {
      set.add(candyType[i]);
    }
    return set.size();
  }
}
