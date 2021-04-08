package com.vojik.solutions;

/**
 * 1578. Minimum Deletion Cost to Avoid Repeating Letters
 */
public class Solution_1578 {

  public int minCost(String s, int[] cost) {
    int ans = 0;
    int[] prev = new int[]{Character.getNumericValue(s.charAt(0)), cost[0]};
    for (int i = 1; i < s.length(); i++) {
      if (Character.getNumericValue(s.charAt(i)) == prev[0]) {
        if (cost[i] < prev[1]) {
          ans += cost[i];
        } else {
          ans += prev[1];
          prev[1] = cost[i];
        }
      } else {
        prev[0] = Character.getNumericValue(s.charAt(i));
        prev[1] = cost[i];
      }
    }
    return ans;
  }
}
