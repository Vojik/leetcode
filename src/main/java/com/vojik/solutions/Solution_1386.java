package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1386. Cinema Seat Allocation
 */
public class Solution_1386 {

  public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

    // boolean[0]: is 2-3-4-5 reserved?
    // boolean[1]: is 4-5-6-7 reserved?
    // boolean[2]: is 6-7-8-9 reserved?
    Map<Integer, boolean[]> map = new HashMap<>();
    for (int[] rs : reservedSeats) {
      map.putIfAbsent(rs[0], new boolean[3]);
      boolean[] row = map.get(rs[0]);
      int seat = rs[1];
      if (seat >= 2 && seat <= 5) {
        row[0] = true;
      }
      if (seat >= 4 && seat <= 7) {
        row[1] = true;
      }
      if (seat >= 6 && seat <= 9) {
        row[2] = true;
      }
      map.put(rs[0], row);
    }

    int result = 2 * (n - map.size());
    for (boolean[] row : map.values()) {
      result += getNumOfFamilies(row);
    }
    return result;
  }

  private int getNumOfFamilies(boolean[] row) {
    int families = 0;
    if (!row[0]) {
      families++;
    }
    if (!row[2]) {
      families++;
    }

    if (families == 0 && !row[1]) {
      families++;
    }
    return families;
  }
}
