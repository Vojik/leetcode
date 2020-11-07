package com.vojik.solutions;

/**
 * 50. Pow(x, n)
 *
 * <p>Implement pow(x, n), which calculates x raised to the power n (i.e. xn).
 *
 * <p>Example 1:
 *
 * <p>Input: x = 2.00000, n = 10 Output: 1024.00000
 *
 * <p>Example 2:
 *
 * <p>Input: x = 2.10000, n = 3 Output: 9.26100
 *
 * <p>Example 3:
 *
 * <p>Input: x = 2.00000, n = -2 Output: 0.25000
 *
 * <p>Explanation: 2-2 = 1/22 = 1/4 = 0.25
 *
 * <p>Constraints:
 * <p>
 * -100.0 < x < 100.0 -231 <= n <= 231-1 -104 <= xn <= 104
 */
public class Solution_50 {

  // Time: O(log(n)) Space: O(log(n))
  public double myPow2(double x, int n) {
    if (n < 0) {
      return 1 / helper(x, Math.abs(n));
    }

    return helper(x, n);
  }

  private double helper(double x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }

    if (n % 2 == 0) {
      return helper(x * x, n / 2);
    }
    return x * helper(x * x, n / 2);
  }

  // Time: O(n) Space: O(1)
  public double myPow(double x, int n) {
    if (n == 0) {
      return 1;
    }

    double res = x;
    for (int i = 1; i < Math.abs(n); i++) {
      res = res * x;
    }
    return n < 0 ? 1 / res : res;
  }
}
