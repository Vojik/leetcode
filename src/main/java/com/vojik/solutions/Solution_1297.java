package com.vojik.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1297. Maximum Number of Occurrences of a Substring
 */
public class Solution_1297 {

  public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
    int left = 0, right = minSize;
    Map<String, Integer> freqMap = new HashMap<>();
    while (right <= s.length()) {
      String key = s.substring(left, right);
      freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
      left++;
      right++;
    }
    int maxFreq = 0;
    for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
      if (isValid(entry.getKey(), maxLetters)) {
        maxFreq = Math.max(maxFreq, entry.getValue());
      }
    }
    return maxFreq;
  }

  private boolean isValid(String str, int maxLetters) {
    Set<Character> set = new HashSet<>();
    for (char ch : str.toCharArray()) {
      set.add(ch);
    }
    return set.size() <= maxLetters;
  }
}