package com.vojik.solutions;

/**
 * 1598. Crawler Log Folder
 */
public class Solution_1598 {

  public int minOperations(String[] logs) {
    int result = 0;
    for (String log : logs) {
      if ("../".equals(log)) {
        result = Math.max(result - 1, 0);
      } else if (!"./".equals(log)) {
        result++;
      }
    }
    return result;
  }
}
