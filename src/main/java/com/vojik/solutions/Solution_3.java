package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 */
public class Solution_3 {

  // Time: O(n) Space: O(n)
  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int max = 0;
    int lastDuplicateIdx = -1;
    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        lastDuplicateIdx = Math.max(lastDuplicateIdx, map.get(s.charAt(i)));
      }

      max = Math.max(max, i - lastDuplicateIdx);
      map.put(s.charAt(i), i);
    }
    return max;
  }

}
