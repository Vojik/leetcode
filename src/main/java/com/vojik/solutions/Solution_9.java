package com.vojik.solutions;

/** 9. Palindrome Number */
public class Solution_9 {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int a = x;
    int y = 0;
    while (a > 0) {
      y = y * 10 + a % 10;
      a /= 10;
    }
    return x == y;
  }
}
