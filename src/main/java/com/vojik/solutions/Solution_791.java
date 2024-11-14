package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 791. Custom Sort String
 */
public class Solution_791 {

  public String customSortString(String order, String s) {
    Map<Character, Integer> freq = new HashMap<>();
    for (char ch : s.toCharArray()) {
      freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }

    StringBuilder sb = new StringBuilder();
    for (char ch : order.toCharArray()) {
      Integer count = freq.get(ch);
      if (count != null) {
        while (count > 0) {
          count--;
          sb.append(ch);
        }
        freq.remove(ch);
      }
    }

    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
      int count = entry.getValue();
      char ch = entry.getKey();
      while (count > 0) {
        count--;
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}
