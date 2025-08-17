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
    int[] count = new int[26];
    int left = 0, right = 0, maxLen = 0, maxCountSoFar = 0;
    while (right < s.length()) {
      int currentChar = s.charAt(right) - 'A';
      count[currentChar]++;

      maxCountSoFar = Math.max(maxCountSoFar, count[currentChar]);

      if (!isValid(left, right, maxCountSoFar, k)) {
        count[s.charAt(left) - 'A']--;
        left++;
      }

      maxLen = right - left + 1;
      right++;
    }
    return maxLen;
  }

  private boolean isValid(int left, int right, int maxCountSoFar, int k) {
    return right - left + 1 - maxCountSoFar <= k;
  }
}
