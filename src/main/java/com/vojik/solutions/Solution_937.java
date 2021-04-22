package com.vojik.solutions;

import java.util.Arrays;

/**
 * 937. Reorder Data in Log Files
 */
public class Solution_937 {

  public String[] reorderLogFiles(String[] logs) {
    Arrays.sort(logs, (a, b) -> {
      String[] firstArr = a.split(" ", 2);
      String[] secondArr = b.split(" ", 2);

      boolean isFirstDigit = Character.isDigit(firstArr[1].charAt(0));
      boolean isSecondDigit = Character.isDigit(secondArr[1].charAt(0));

      if (!isFirstDigit && !isSecondDigit) {
        int cmp = firstArr[1].compareTo(secondArr[1]);
        return cmp != 0 ? cmp : firstArr[0].compareTo(secondArr[0]);
      } else if (isFirstDigit && !isSecondDigit) {
        return 1;
      } else if (!isFirstDigit && isSecondDigit) {
        return -1;
      }
      return 0;

    });
    return logs;
  }
}
