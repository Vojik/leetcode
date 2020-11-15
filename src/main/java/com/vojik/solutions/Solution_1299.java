package com.vojik.solutions;

/**
 * 1299. Replace Elements with Greatest Element on Right Side
 * <p>
 * Given an array arr, replace every element in that array with the greatest element among the
 * elements to its right, and replace the last element with -1.
 *
 * <p>After doing so, return the array.
 *
 * <p>Example 1:
 * <p>Input: arr = [17,18,5,4,6,1] Output: [18,6,6,6,1,-1]
 *
 * <p>Constraints:
 * <p>1 <= arr.length <= 10^4 1 <= arr[i] <= 10^5
 */
public class Solution_1299 {

  // Time: O(n) Space: O(n)
  public int[] replaceElements(int[] arr) {
    int max = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      int newMax = Math.max(arr[i], max);
      arr[i] = max;
      max = newMax;
    }
    return arr;
  }

}
