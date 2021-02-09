package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution_205 {

  public boolean isIsomorphic(String s, String t) {
    int len = s.length();
    if (len != t.length()) {
      return false;
    }

    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);

      if (map.containsKey(sChar)) {
        if (map.get(sChar) != tChar) {
          return false;
        }
      } else {
        if (map.containsValue(tChar)) {
          return false;
        }
        map.put(sChar, tChar);
      }
    }
    return true;
  }
}
