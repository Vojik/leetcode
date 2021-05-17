package com.vojik.solutions;

/** 1539. Kth Missing Positive Number */
public class Solution_1539 {

  public int findKthPositive(int[] arr, int k) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] - mid - 1 < k) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    // left == right + 1, so arr[right] + k - (arr[right] - right - 1) == k + right + 1 == k + left
    return k + left;
  }

  public int findKthPositive2(int[] arr, int k) {
    int cursor = 0;
    for (int i = 1; i <= 1000 && cursor < arr.length; i++) {
      if (arr[cursor] == i) {
        cursor++;
      } else {
        k--;
        if (k == 0) {
          return i;
        }
      }
    }
    return arr[arr.length - 1] + k;
  }
}
