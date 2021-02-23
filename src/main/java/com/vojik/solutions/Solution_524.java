package com.vojik.solutions;

import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting
 */
public class Solution_524 {

  public String findLongestWord(String s, List<String> d) {
    String ans = "";
    for (String word : d) {
      if (isSubstring(s, word) && (word.length() > ans.length() || (word.length() == ans.length()
          && word.compareTo(ans) < 0))) {
        ans = word;
      }
    }
    return ans;
  }

  private boolean isSubstring(String s, String word) {
    int cursor = 0;
    int i = 0;
    while (cursor < s.length() && i < word.length()) {
      if (s.charAt(cursor) == word.charAt(i)) {
        i++;
      }
      cursor++;
    }
    return i == word.length();
  }
}
