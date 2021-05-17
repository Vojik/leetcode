package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 953. Verifying an Alien Dictionary */
public class Solution_953 {

  public boolean isAlienSorted(String[] words, String order) {
    Map<Character, Integer> alphabet = new HashMap<>();
    for (int i = 0; i < order.length(); i++) {
      alphabet.put(order.charAt(i), i);
    }

    for (int i = 1; i < words.length; i++) {
      if (!goodSorted(words[i - 1], words[i], alphabet)) {
        return false;
      }
    }
    return true;
  }

  private boolean goodSorted(String first, String second, Map<Character, Integer> alphabet) {
    for (int j = 0; j < first.length(); j++) {
      if (j >= second.length()) {
        return false;
      }
      if (first.charAt(j) != second.charAt(j)) {
        if (alphabet.get(second.charAt(j)) < alphabet.get(first.charAt(j))) {
          return false;
        }
        break;
      }
    }
    return true;
  }
}
