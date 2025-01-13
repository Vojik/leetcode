package com.vojik.solutions;

/**
 * 2185. Counting Words With a Given Prefix
 */
public class Solution_2185 {

  public int prefixCount(String[] words, String pref) {
    int counter = 0;
    for (String word : words) {
      if (word.startsWith(pref)) {
        counter++;
      }
    }
    return counter;
  }

}
