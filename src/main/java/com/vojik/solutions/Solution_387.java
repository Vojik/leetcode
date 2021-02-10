package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 */
public class Solution_387 {

  public int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (map.get(s.charAt(i)) == 1) {
        return i;
      }

    }
    return -1;
  }
}
