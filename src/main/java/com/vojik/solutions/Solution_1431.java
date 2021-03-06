package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/** 1431. Kids With the Greatest Number of Candies */
public class Solution_1431 {

  // Time: O(2n)
  // Space: O(1)
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    for (int i = 0; i < candies.length; i++) {
      max = Math.max(max, candies[i]);
    }
    List<Boolean> ans = new ArrayList<>();
    for (int i = 0; i < candies.length; i++) {
      ans.add(candies[i] + extraCandies >= max);
    }
    return ans;
  }
}
