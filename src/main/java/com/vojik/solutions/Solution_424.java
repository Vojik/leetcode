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

  public int characterReplacement2(String s, int k) {
    int result = 0, left = 0, right = 0;
    int[] chars = new int[26];

    while (right < s.length() && left <= right) {

      chars[s.charAt(right) - 'A']++;
      if (isValidWindow(chars, k)) {
        result = Math.max(result, right - left + 1);
        right++;
      } else {
        chars[s.charAt(left++) - 'A']--;
      }
    }
    return result;
  }

  private boolean isValidWindow(int[] chars, int k) {
    int numOfChars = 0;
    int count1 = 0, count2 = 0;

    for (int count : chars) {
      if (count > 0) {
        numOfChars++;
        if (numOfChars > 2) return false;
        if (numOfChars == 1) count1 = count;
        if (numOfChars == 2) count2 = count;
      }
    }

    if (k == 0 && numOfChars > 1) return false;

    return k>= Math.min(count1, count2);
  }
}
