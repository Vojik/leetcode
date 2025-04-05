package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 */
public class Solution_438 {

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    if (p.length() > s.length()) {
      return result;
    }
    int[] p_array = new int[26];
    int[] s_array = new int[26];
    for (char c : p.toCharArray()) {
      p_array[c - 'a']++;
    }

    int left = 0, right = 0;
    while (right < s.length()) {
      if (right >= p.length()) {
        s_array[s.charAt(left++) - 'a']--;
      }
      s_array[s.charAt(right) - 'a']++;
      if (isAnagrams(s_array, p_array)) {
        result.add(left);
      }
      right++;
    }
    return result;
  }

  private boolean isAnagrams(int[] arr1, int[] arr2) {
    for (int i = 0; i < 26; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }
    return true;
  }
}
