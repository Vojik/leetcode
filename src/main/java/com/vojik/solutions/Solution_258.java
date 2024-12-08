package com.vojik.solutions;

/**
 * 258. Add Digits
 */
public class Solution_258 {

  public int addDigits(int num) {
    while (num >= 10) {
      num = sumNums(num);
    }
    return num;
  }

  private int sumNums(int num) {
    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}
