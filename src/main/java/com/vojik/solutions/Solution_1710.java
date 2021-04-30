package com.vojik.solutions;

import java.util.Arrays;

/**
 * 1710. Maximum Units on a Truck
 */
public class Solution_1710 {

  public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
    int total = 0;
    int numOfBoxInTruck = 0;

    for (int[] type : boxTypes) {
      if (truckSize >= type[0]) {
        total += type[0] * type[1];
        truckSize -= type[0];
      } else {
        total += truckSize * type[1];
        break;
      }
    }
    return total;
  }
}
