package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 820. Short Encoding of Words
 */
public class Solution_820 {

  public int minimumLengthEncoding(String[] words) {
    // not my solution
    Set<String> good = new HashSet(Arrays.asList(words));
    for (String word: words) {
      for (int k = 1; k < word.length(); ++k)
        good.remove(word.substring(k));
    }

    int ans = 0;
    for (String word: good)
      ans += word.length() + 1;
    return ans;
  }

  // Time: O(mlog(m) + n)
  public int minimumLengthEncodingNonOptimal(String[] words) {
    Arrays.sort(words, Comparator.comparingInt(String::length));
    List<String> validWords = new ArrayList<>();
    validWords.add(words[words.length - 1]);

    int ans = words[words.length - 1].length() + 1;
    for (int i = words.length - 2; i >= 0; i--) {
      String word = words[i];
      if (!isValidSubstring(word, validWords)) {
        ans += word.length() + 1;
        validWords.add(word);
      }
    }
    return ans;
  }

  private boolean isValidSubstring(String word, List<String> validWords) {
    for (String validWord : validWords) {
      for (int j = word.length() - 1, idx = validWord.length() - 1; j >= 0; j--, idx--) {
        if (word.charAt(j) != validWord.charAt(idx)) {
          break;
        }
        if (j == 0) {
          return true;
        }
      }

    }
    return false;
  }
}
