package com.vojik.solutions;

/**
 * 977. Squares of a Sorted Array
 *
 * <p>Given an array of integers A sorted in non-decreasing order, return an array of the squares of
 * each number, also in sorted non-decreasing order.
 *
 * <p>Example 1:
 *
 * <p>Input: [-4,-1,0,3,10] Output: [0,1,9,16,100] Example 2:
 *
 * <p>Input: [-7,-3,2,3,11] Output: [4,9,9,49,121]
 *
 * <p>Note:
 *
 * <p>1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 */
public class Solution_977 {

  // Time: O(n) Memory: O(n)
  public int[] sortedSquares(int[] A) {

    int left = 0;
    int right = A.length - 1;
    int[] result = new int[A.length];
    int cursor = right;

    while (cursor >= 0) {
      if (Math.abs(A[left]) > Math.abs(A[right])) {
        result[cursor] = A[left] * A[left];
        left++;
      } else {
        result[cursor] = A[right] * A[right];
        right--;
      }
      cursor--;
    }
    return result;
  }
}
