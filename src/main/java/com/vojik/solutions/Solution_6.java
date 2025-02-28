package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 6. Zigzag Conversion
 */
public class Solution_6 {

  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }
    Map<Integer, StringBuilder> map = new HashMap<>();
    for (int i = 0; i < numRows; i++) {
      map.put(i, new StringBuilder());
    }
    int direction = -1;
    int currentLine = 0;
    for (int i = 0; i < s.length(); i++) {
      map.get(currentLine).append(s.charAt(i));
      if (currentLine == numRows - 1 || currentLine == 0) {
        direction *= -1;
      }
      currentLine += direction;
    }
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      ans.append(map.get(i).toString());
    }
    return ans.toString();
  }
}
