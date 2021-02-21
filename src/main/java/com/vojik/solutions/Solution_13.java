package com.vojik.solutions;

import java.util.Map;

/**
 * 13. Roman to Integer
 */
public class Solution_13 {

  private static final Map<Character, Integer> ROMANS = Map
      .of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

  public int romanToInt(String s) {
    int current = 0;
    int previous = Integer.MAX_VALUE;
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      current = ROMANS.get(s.charAt(i));
      if (current > previous) {
        result += current - (2 * previous);
      } else {
        result += current;
      }
      previous = current;
    }
    return result;
  }
}
