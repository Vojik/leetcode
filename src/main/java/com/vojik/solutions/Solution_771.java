package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. Jewels and Stones
 */
public class Solution_771 {

  // Time: O(n+m) Space: O(n)
  public int numJewelsInStones(String jewels, String stones) {
    Set<Character> jew = new HashSet<>();
    int num = 0;

    for (int i = 0; i < jewels.length(); i++) {
      jew.add(jewels.charAt(i));
    }
    for (int i = 0; i < stones.length(); i++) {
      if (jew.contains(stones.charAt(i))) {
        num++;
      }
    }
    return num;
  }
}
