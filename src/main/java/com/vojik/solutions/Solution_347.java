package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347. Top K Frequent Elements
 */
public class Solution_347 {


  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    int topOneOccurance = 0;
    for (int n : nums) {
      int f = freq.getOrDefault(n, 0) + 1;
      topOneOccurance = Math.max(topOneOccurance, f);
      freq.put(n, f);
    }

    List<Integer>[] top = new ArrayList[topOneOccurance];
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      if (top[entry.getValue() - 1] == null) {
        top[entry.getValue() - 1] = new ArrayList<>();
      }
      top[entry.getValue() - 1].add(entry.getKey());
    }

    int[] result = new int[k];
    for (int i = topOneOccurance - 1; i >= 0 && k > 0; i--) {
      List<Integer> list = top[i];
      if (list != null) {
        for (int num : list) {
          result[--k] = num;
        }
      }
    }
    return result;
  }
}
