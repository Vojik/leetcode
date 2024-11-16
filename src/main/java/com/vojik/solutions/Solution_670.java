package com.vojik.solutions;

/**
 * 670. Maximum Swap
 */
public class Solution_670 {

  public int maximumSwap(int num) {
    if (num < 10) {
      return num;
    }
    String str = "" + num;
    int max = 0;
    boolean canSwap = false;
    int swapIdx = 0;
    for (int i = 1; i < str.length(); i++) {
      if (canSwap) {
        if (str.charAt(i) - '0' >= max) {
          max = str.charAt(i) - '0';
          swapIdx = i;
        }
      } else {
        if (str.charAt(i) > str.charAt(i - 1)) { // define if can swap
          canSwap = true;
          max = str.charAt(i) - '0';
          swapIdx = i;
        }
      }
    }

    if (canSwap) {
      for (int i = 0; i < swapIdx; i++) {
        if (str.charAt(i) - '0' < max) {
          char temp = str.charAt(i);
          StringBuilder sb = new StringBuilder(str);
          sb.setCharAt(i, str.charAt(swapIdx));
          sb.setCharAt(swapIdx, temp);
          return Integer.parseInt(sb.toString());
        }
      }
    }
    return num;
  }
}
