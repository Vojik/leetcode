package com.vojik.solutions;

/**
 * 556. Next Greater Element III
 */
public class Solution_556 {

  public int nextGreaterElement(int n) {
    // 158476531
    // 1585----76431
    // 158513467

    char[] arr = ("" + n).toCharArray();

    // find the first decreading from the end
    int i = arr.length - 2;
    while (i >= 0 && arr[i] >= arr[i + 1]) {
      i--;
    }
    if (i < 0) {
      return -1;
    }

    // find first bigger then arr[i] from the end
    int j = arr.length - 1;
    while (j >= 0 && arr[j] <= arr[i]) {
      j--;
    }
    swap(arr, i, j);
    reverse(arr, i + 1, arr.length - 1);

    try {
      return Integer.parseInt(new String(arr));
    } catch (Exception e) {
      return -1;
    }
  }

  private void swap(char[] arr, int i, int j) {
    char t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  private void reverse(char[] arr, int i, int j) {
    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
  }
}
