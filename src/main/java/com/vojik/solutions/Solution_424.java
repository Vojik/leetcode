package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 424. Longest Repeating Character Replacement
 */
public class Solution_424 {

  public int characterReplacement(String s, int k) {
    int start = 0;
    int maxLength = 0;
    int maxRepeatLetterCount = 0;
    Map<Character, Integer> map = new HashMap<>();

    for (int end = 0; end < s.length(); end++) {
      char ch = s.charAt(end);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
      maxRepeatLetterCount = Math.max(maxRepeatLetterCount, map.get(ch));

      if (end - start - maxRepeatLetterCount + 1 > k) {
        char startCh = s.charAt(start);
        map.put(startCh, map.get(startCh) - 1);
        start++;
      }
      maxLength = Math.max(maxLength, end - start + 1);
    }

    return maxLength;
  }
}
