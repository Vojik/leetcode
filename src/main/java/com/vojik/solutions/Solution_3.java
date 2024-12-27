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

  // Time: O(2n) Space: O(n)
  public int lengthOfLongestSubstring2(String s) {
    Map<Character, Integer> freq = new HashMap<>();
    int result = 0;
    for (int left = 0, right = 0; right < s.length(); right++) {
      char ch = s.charAt(right);
      freq.put(ch, freq.getOrDefault(ch, 0) + 1);

      while (freq.get(ch) > 1) {
        char leftCh = s.charAt(left);
        freq.put(leftCh, freq.get(leftCh) - 1);
        left++;
      }
      result = Math.max(result, right - left + 1);
    }
    return result;
  }

}
