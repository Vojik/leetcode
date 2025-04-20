package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 1010. Pairs of Songs With Total Durations Divisible by 60 */
public class Solution_1010 {

  public int numPairsDivisibleBy60(int[] time) {
    Map<Integer, List<Integer>> numToIdx = new HashMap<>();
    int ans = 0;
    for (int i = 0; i < time.length; i++) {
      int num = time[i] % 60;
      int nextNum = num == 0 ? 0 : 60 - num;
      if (numToIdx.containsKey(nextNum)) {
        ans += numToIdx.get(nextNum).size();
      }
      List<Integer> list = numToIdx.getOrDefault(num, new ArrayList<>());
      list.add(i);
      numToIdx.put(num, list);
    }
    return ans;
  }

}
