package com.vojik.solutions;

/**
 * 1684. Count the Number of Consistent Strings
 */
public class Solution_1684 {

  public int countConsistentStrings(String allowed, String[] words) {
    boolean[] allowedSet = new boolean[26];
    for (int i = 0; i < allowed.length(); i++) {
      allowedSet[allowed.charAt(i) - 'a'] = true;
    }
    int count = 0;
    for (String word : words) {
      boolean consistent = true;
      for (char ch : word.toCharArray()) {
        if (!allowedSet[ch - 'a']) {
          consistent = false;
          break;
        }
      }
      if (consistent) count++;
    }
    return count;
  }
}
