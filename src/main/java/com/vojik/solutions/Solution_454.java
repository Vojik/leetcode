package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution_454 {

  // Time: O(n^2) Space: O(n^2)
  public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    Map<Integer, Integer> map = new HashMap<>();
    int counter = 0;

    int len = A.length;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        map.put(A[i] + B[j], map.getOrDefault(A[i] + B[j], 0) + 1);
      }
    }

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        counter += map.getOrDefault(-1 * (C[i] + D[j]), 0);
      }
    }
    return counter;
  }

}
