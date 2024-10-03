package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1331. Rank Transform of an Array
 */
public class Solution_1331 {

  public int[] arrayRankTransform(int[] arr) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      List<Integer> positions = map.getOrDefault(arr[i], new ArrayList<Integer>());
      positions.add(i);
      map.put(arr[i], positions);
    }
    Arrays.sort(arr);
    int[] result = new int[arr.length];
    int rank = 1;
    for (int i = 0; i < arr.length; i++) {
      List<Integer> positions = map.get(arr[i]);
      if (positions != null) {
        for (int pos : positions) {
          result[pos] = rank;
        }
        map.remove(arr[i]);
        rank++;
      }
    }
    return result;
  }
}
