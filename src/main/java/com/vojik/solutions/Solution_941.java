package com.vojik.solutions;

/**
 * 941. Valid Mountain Array
 * <p>
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if: arr.length >= 3 There exists some i with 0 <
 * i < arr.length - 1 such that: arr[0] < arr[1] < ... < arr[i - 1] < A[i] arr[i] > arr[i + 1] > ...
 * > arr[arr.length - 1]
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [2,1] Output: false
 * <p>
 * Example 2: Input: arr = [3,5,5] Output: false
 * <p>
 * Example 3: Input: arr = [0,3,2,1] Output: true
 * <p>
 * Constraints: 1 <= arr.length <= 104 0 <= arr[i] <= 104
 */
public class Solution_941 {

  // Time: O(n) Space: O(1)
  public boolean validMountainArray(int[] arr) {
    if (arr == null || arr.length < 3) {
      return false;
    }

    if (arr[0] >= arr[1]) {
      return false;
    }

    int cur = 1;
    for (; cur < arr.length - 1; cur++) {
      if (arr[cur - 1] == arr[cur]) {
        return false;
      }
      if (arr[cur - 1] > arr[cur]) {
        cur++;
        break;
      }
    }

    for (;cur < arr.length; cur++) {
      if (arr[cur - 1] <= arr[cur]) {
        return false;
      }
    }

    return cur == arr.length;
  }

}
