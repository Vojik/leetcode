package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 340. Longest Substring with At Most K Distinct Characters */
public class Solution_340 {

  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (k == 0 || s == null || s.isEmpty()) {
      return 0;
    }
    Map<Character, Integer> freq = new HashMap<>();
    int longest = 0;
    int left = 0;
    int right = 0;
    while (right < s.length()) {
      char ch = s.charAt(right);
      freq.put(ch, freq.getOrDefault(ch, 0) + 1);
      while (freq.size() > k && left < right) {
        char leftCh = s.charAt(left);
        freq.put(leftCh, freq.getOrDefault(leftCh, 0) - 1);
        if (freq.get(leftCh) == 0) {
          freq.remove(leftCh);
        }
        left++;
      }
      longest = Math.max(longest, right - left + 1);
      right++;
    }
    return longest;
  }
}
