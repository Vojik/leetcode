package com.vojik.solutions;


/**
 * 1903. Largest Odd Number in String
 */
public class Solution_1903 {

  public String largestOddNumber(String num) {
    for (int i = num.length() - 1; i >= 0; --i) {
      if (Integer.valueOf(num.charAt(i)) % 2 != 0) {
        return num.substring(0, i + 1);
      }
    }
    return "";
  }
}


