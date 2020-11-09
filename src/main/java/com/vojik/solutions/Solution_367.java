package com.vojik.solutions;

/**
 * 367. Valid Perfect Square
 *
 * <p>Given a positive integer num, write a function which returns True if num is a perfect square
 * else False.
 *
 * <p>Follow up: Do not use any built-in library function such as sqrt.
 *
 * <p>Example 1:
 * <p>Input: num = 16 Output: true
 * <p>
 * Example 2:
 * <p>Input: num = 14 Output: false
 *
 * <p>Constraints:
 * <p>1 <= num <= 2^31 - 1
 */
public class Solution_367 {

  // Time: O(log(n)) Space: O(1)
  public boolean isPerfectSquare(int num) {
    if (num == 1) {
      return true;
    }

    long left = 1;
    long right = num;

    while (left <= right) {
      long mid = left + (right - left) / 2;
      long temp = mid * mid;
      if (temp == num) {
        return true;
      } else if (temp < num) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return false;
  }

}
