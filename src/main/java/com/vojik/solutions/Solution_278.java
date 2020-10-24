package com.vojik.solutions;

/**
 * 278. First Bad Version
 *
 * <p>You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check. Since each version is
 * developed based on the previous version, all the versions after a bad version are also bad.
 *
 * <p>Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
 * causes all the following ones to be bad.
 *
 * <p>You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to
 * the API.
 *
 * <p>Example 1:
 * <p>Input: n = 5, bad = 4 Output: 4 Explanation: call isBadVersion(3) -> false call
 * isBadVersion(5) -> true call isBadVersion(4) -> true Then 4 is the first bad version. Example 2:
 * <p>Input: n = 1, bad = 1 Output: 1
 *
 * <p>Constraints:
 * <p>1 <= bad <= n <= 231 - 1
 */

public class Solution_278 {
  /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

  private int badVersion;

  public Solution_278(int badVersion) {
    this.badVersion = badVersion;
  }

  public int firstBadVersion(int n) {
    if (n == 1) {
      return 1;
    }

    int left = 1;
    int right = n;

    while (left < right) {
      // Prevent (left + right) overflow
      int middle = left + (right - left) / 2;

      if (isBadVersion(middle)) {
        right = middle;
      } else {
        left = middle + 1;
      }
    }
    return left;

  }

  private boolean isBadVersion(int number) {
    return number >= badVersion;
  }

}
