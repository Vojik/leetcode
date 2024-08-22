package com.vojik.solutions;

import java.util.Arrays;

public class Solution_1768 {

  public String mergeAlternately(String word1, String word2) {
    StringBuilder builder = new StringBuilder();
    int len1 = word1.length();
    int len2 = word2.length();
    for (int i = 0; i < Math.max(len1, len2); i++) {
      if (i < len1) {
        builder.append(word1.charAt(i));
      }
      if (i < len2) {
        builder.append(word2.charAt(i));
      }
    }
    return builder.toString();
  }
}
