package com.vojik.solutions;

/**
 * 1287. Element Appearing More Than 25% In Sorted Array
 */
public class Solution_1287 {

  // Time: O(n) Space: O(1)
  public int findSpecialInteger(int[] arr) {
    int t = arr.length / 4;
    for (int i = 0; i < arr.length - t; i++) {
      if (arr[i] == arr[i + t]) {
        return arr[i];
      }
    }
    return -1;
  }
}