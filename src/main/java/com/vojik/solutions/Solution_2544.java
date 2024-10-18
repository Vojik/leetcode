package com.vojik.solutions;

/**
 * 2544. Alternating Digit Sum
 */
public class Solution_2544 {

  public int alternateDigitSum(int n) {
    int ans = 0;
    String str = String.valueOf(n);
    boolean isPlus = true;
    for (char ch : str.toCharArray()) {
      int num = ch - '0';
      if (isPlus) {
        ans += num;
      } else {
        ans -= num;
      }
      isPlus = !isPlus;
    }
    return ans;

  }
}
