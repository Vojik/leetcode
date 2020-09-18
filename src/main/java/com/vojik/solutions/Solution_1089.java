package com.vojik.solutions;

/**
 * 1089. Duplicate Zeros
 *
 * <p>Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the
 * remaining elements to the right.
 *
 * <p>Note that elements beyond the length of the original array are not written.
 *
 * <p>Do the above modifications to the input array in place, do not return anything from your
 * function.
 *
 * <p>Example 1:
 *
 * <p>Input: [1,0,2,3,0,4,5,0] Output: null Explanation: After calling your function, the input
 * array is modified to: [1,0,0,2,3,0,0,4] Example 2:
 *
 * <p>Input: [1,2,3] Output: null Explanation: After calling your function, the input array is
 * modified to: [1,2,3]
 *
 * <p>Note:
 *
 * <p>1 <= arr.length <= 10000 0 <= arr[i] <= 9
 */
public class Solution_1089 {

  // Time: O(n) Memory: O(1)
  public void duplicateZeros(int[] arr) {
    if (arr.length == 1) {
      return;
    }

    int dupNum = 0;
    int right = arr.length - 1;
    int left = 0;
    int tempRight = right;

    while (left <= tempRight) {
      if (arr[left] == 0) {
        // edge case
        if (left == tempRight) {
          arr[right] = 0;
          right--;
          break;
        }
        tempRight--;
        dupNum++;
      }
      left++;
    }

    for (int i = right - dupNum; i >= 0; i--) {
      if (arr[i] == 0) {
        arr[right] = 0;
        right--;
        arr[right] = 0;
      } else {
        arr[right] = arr[i];
      }
      right--;
    }
  }
}
