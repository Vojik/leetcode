package com.vojik.solutions;

/**
 * 567. Permutation in String
 */
public class Solution_567 {

  public boolean checkInclusion(String s1, String s2) {
    int len1 = s1.length();
    int len2 = s2.length();
    if (len1 > len2) {
      return false;
    }

    int[] expectedLetters = new int[26];
    for (char ch : s1.toCharArray()) {
      expectedLetters[ch - 'a']++;
    }

    int[] currentLetters = new int[26];
    int left = 0, right = 0;
    while (right < len2) {
      currentLetters[s2.charAt(right) - 'a']++;
      if (right - left + 1 == len1) {
        if (isArraysEqual(expectedLetters, currentLetters)) {
          return true;
        }
        currentLetters[s2.charAt(left) - 'a']--;
        left++;
      }
      right++;
    }
    return false;
  }

  private boolean isArraysEqual(int[] expectedLetters, int[] currentLetters) {
    for (int i = 0; i < 26; i++) {
      if (expectedLetters[i] != currentLetters[i]) {
        return false;
      }
    }
    return true;
  }
}
