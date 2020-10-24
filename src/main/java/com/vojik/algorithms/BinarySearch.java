package com.vojik.algorithms;

public class BinarySearch {

  public static int binarySearch(int[] array, int value) {
    if (array == null || array.length == 0) {
      return -1;
    }

    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      // Prevent (left + right) overflow
      int middle = left + (right - left) / 2;
      if (array[middle] > value) {
        right = middle - 1;
      } else if (array[middle] < value) {
        left = middle + 1;
      } else {
        return middle;
      }
    }
    return -1;
  }

  public static int binarySearch2(int[] array, int target) {
    if (array == null || array.length == 0) {
      return -1;
    }

    int left = 0;
    int right = array.length;

    while (left < right) {
      // Prevent (left + right) overflow
      int middle = left + (right - left) / 2;

      if (target == array[middle]) {
        return middle;
      } else if (target > array[middle]) {
        left = middle + 1;
      } else {
        right = middle;
      }
    }

    return -1;
  }
}
