package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 */
public class Solution_76 {

  public String minWindow(String s, String t) {
    int m = s.length();
    int n = t.length();
    if (n > m || m == 0 || n == 0) {
      return "";
    }

    Map<Character, Integer> expectedFreq = new HashMap<>();
    for (char c : t.toCharArray()) {
      expectedFreq.put(c, expectedFreq.getOrDefault(c, 0) + 1);
    }
    Map<Character, Integer> currentFreq = new HashMap<>();
    int left = 0, right = 0;
    int[] result = new int[]{-1, 0, 0};
    while (right < m) {
      char ch = s.charAt(right);
      currentFreq.put(ch, currentFreq.getOrDefault(ch, 0) + 1);
      while (isValid(expectedFreq, currentFreq)) {
        if (result[0] == -1 || result[0] > right - left + 1) {
          result[0] = right - left + 1;
          result[1] = left;
          result[2] = right;
        }
        char leftCh = s.charAt(left);
        currentFreq.put(leftCh, currentFreq.get(leftCh) - 1);
        left++;
      }
      right++;
    }
    return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
  }

  private boolean isValid(Map<Character, Integer> expectedFreq,
      Map<Character, Integer> currentFreq) {
    for (Map.Entry<Character, Integer> entry : expectedFreq.entrySet()) {
      Integer count = currentFreq.get(entry.getKey());
      if (count == null || count < entry.getValue()) {
        return false;
      }
    }
    return true;
  }
}
