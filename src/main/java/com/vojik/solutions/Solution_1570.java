package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 1570. Dot Product of Two Sparse Vectors */
public class Solution_1570 {

  private Map<Integer, Integer> map;

  Solution_1570(int[] nums) {
    this.map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        map.put(i, nums[i]);
      }
    }
  }

  // Return the dotProduct of two sparse vectors
  public int dotProduct(Solution_1570 vec) {
    Map<Integer, Integer> secondMap = vec.map;
    int sum = 0;
    for (Map.Entry<Integer, Integer> entry : secondMap.entrySet()) {
      Integer value1 = this.map.get(entry.getKey());
      int value2 = entry.getValue();
      if (value1 != null) {
        sum += value1 * value2;
      }
    }
    return sum;
  }
}
