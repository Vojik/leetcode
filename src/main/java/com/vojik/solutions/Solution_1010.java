package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 1010. Pairs of Songs With Total Durations Divisible by 60 */
public class Solution_1010 {

  private static final List<Integer> DIV = List.of(60, 120, 180, 240, 300, 360, 420, 480, 540, 600, 660, 720, 780, 840, 900, 960);

  // non optimal solution
  public int numPairsDivisibleBy60(int[] time) {
    Map<Integer, List<Integer>> freq = new HashMap<>();
    for (int i = 0; i < time.length; i++) {
      List<Integer> list = freq.getOrDefault(time[i], new ArrayList<>());
      list.add(i);
      freq.put(time[i], list);
    }

    int count = 0;
    for (int i = 0; i < time.length; i++) {
      for (int div : DIV) {
        int diff = div - time[i];
        if (diff > 0) {
          List<Integer> indeses = freq.get(diff);
          if (indeses == null) {
            continue;
          }
          for (int idx : indeses) {
            if (idx > i) {
              count++;
            }
          }
        }
      }

    }
    return count;
  }

}
