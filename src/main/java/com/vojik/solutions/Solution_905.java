package com.vojik.solutions;

/**
 * 905. Sort Array By Parity
 *
 * <p>Given an array A of non-negative integers, return an array consisting of all the even
 * elements of A, followed by all the odd elements of A.
 *
 * <p>You may return any answer array that satisfies this condition.
 *
 * <p>Example 1:
 *
 * <p>Input: [3,1,2,4] Output: [2,4,3,1] The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also
 * be accepted.
 *
 * <p>Note:
 * <p>1 <= A.length <= 5000 0 <= A[i] <= 5000
 */
public class Solution_905 {

  public int[] sortArrayByParity(int[] A) {
    int left = 0;
    int right = A.length - 1;

    while (left < right) {
      if (A[left] % 2 != 0 && A[right] % 2 == 0) {
        int temp = A[right];
        A[right] = A[left];
        A[left] = temp;
      }

      if (A[left] % 2 == 0) {
        left++;
      }
      if (A[right] % 2 != 0) {
        right--;
      }
    }
    return A;
  }

}
