package com.vojik.algorithms;

public class BinarySearch {

  public static int binarySearch(int[] array, int value) {
    if (array == null || array.length == 0) {
      throw new RuntimeException("empty array");
    }

    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int middle = (left + right) / 2;
      if (array[middle] > value) {
        right = middle - 1;
      } else if (array[middle] < value) {
        left = middle + 1;
      } else {
        return middle;
      }
    }
    throw new RuntimeException("not found");
  }
}
