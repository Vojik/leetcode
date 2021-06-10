package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 720. Longest Word in Dictionary
 */
public class Solution_720 {

  public String longestWord(String[] words) {
    Set<String> set = new HashSet<>(Arrays.asList(words));
    String ans = "";
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (word.length() < ans.length()
          || (word.length() == ans.length() && word.compareTo(ans) > 0)) {
        continue;
      }
      int len = word.length();
      while (len > 0 && set.contains(word.substring(0, len))) {
        len--;
      }
      if (len == 0) {
        ans = word;
      }
    }
    return ans;
  }
}
