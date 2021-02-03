package com.vojik.solutions;

/**
 * 66. Plus One
 */
public class Solution_66 {

  public int[] plusOne(int[] digits) {
    boolean needPlus = true;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (needPlus) {
        if (digits[i] != 9) {
          digits[i]++;
          return digits;
        }
        digits[i] = 0;
      }
    }
    if (digits[0] == 0) { // then all elements are 0
      int[] res = new int[digits.length + 1];
      res[0] = 1;
      return res;
    }
    return digits;
  }
}
