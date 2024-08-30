package com.vojik.solutions;

/**
 * 69. Sqrt(x)
 *
 * <p>Implement int sqrt(int x).
 *
 * <p>Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * <p>Since the return type is an integer, the decimal digits are truncated and only the integer
 * part of the result is returned.
 *
 * <p>Example 1:
 *
 * <p>Input: 4 Output: 2 Example 2:
 *
 * <p>Input: 8 Output: 2 Explanation: The square root of 8 is 2.82842..., and since the decimal
 * part is truncated, 2 is returned.
 */
public class Solution_69 {

  // Newton's method
  public int mySqrt(int x) {
    if (x == 0) {
      return 0;
    }
    long num = x / 2;
    while (num * num > x) {
      num = (num + x / num) / 2;
    }
    return (int) num;
  }

  // binary search method
  public int mySqrt2(int x) {
    if (x == 0) {
      return 0;
    }

    long left = 0;
    long right = Integer.MAX_VALUE;

    while (true) {
      long mid = left + (right - left) / 2;
      if (mid * mid > x) {
        right = mid - 1;
      } else if ((mid + 1) * (mid + 1) > x) {
        return (int) mid;
      } else {
        left = mid + 1;
      }
    }
  }

  public int mySqrt3(int x) {
    if (x == 0 || x == 1) return x;
    int lo = 1;
    int hi = x;
    int ans = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      long option = (long) mid * mid;
      if (option == x) {
        return mid;
      } else if (option < (long) x) {
        ans = mid;
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return ans;
  }


}
