package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 340. Longest Substring with At Most K Distinct Characters */
public class Solution_340 {

  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (k == 0 || s == null || s.isEmpty()) {
      return 0;
    }
    Map<Character, Integer> freqMap = new HashMap<>();
    int left = 0, right = 0, longest = 0;
    while (right < s.length()) {
      char currentChar = s.charAt(right);
      freqMap.put(currentChar, freqMap.getOrDefault(currentChar, 0) + 1);

      while (freqMap.size() > k) {
        char leftChar = s.charAt(left);
        freqMap.put(leftChar, freqMap.get(leftChar) - 1);
        if (freqMap.get(leftChar) == 0) {
          freqMap.remove(leftChar);
        }
        left++;
      }

      longest = Math.max(longest, right - left + 1);
      right++;
    }
    return longest;
  }
}
