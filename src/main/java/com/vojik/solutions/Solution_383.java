package com.vojik.solutions;

/**
 * 383. Ransom Note
 */
public class Solution_383 {

  public boolean canConstruct(String ransomNote, String magazine) {
    int[] dictionary = new int[26];
    for (char ch : magazine.toCharArray()) {
      dictionary[ch - 'a']++;
    }

    for (char ch : ransomNote.toCharArray()) {
      if (dictionary[ch - 'a'] > 0) {
        dictionary[ch - 'a']--;
      } else {
        return false;
      }
    }
    return true;
  }
}
