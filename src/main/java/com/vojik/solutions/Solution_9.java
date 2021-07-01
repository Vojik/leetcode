package com.vojik.solutions;

/** 9. Palindrome Number */
public class Solution_9 {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int max = Integer.MAX_VALUE / 10 - 10;
    int originalNum = x;
    int newNum = 0;
    while (x != 0 && newNum < max) {
      newNum = newNum * 10 + x % 10;
      x /= 10;
    }
    return originalNum == newNum;
  }
}
