package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 244. Shortest Word Distance II */
public class Solution_244 {

  Map<String, List<Integer>> map = new HashMap<>();

  public Solution_244(String[] wordsDict) {
    for (int i = 0; i < wordsDict.length; i++) {
      if (!map.containsKey(wordsDict[i])) {
        map.put(wordsDict[i], new ArrayList<Integer>());
      }
      map.get(wordsDict[i]).add(i);
    }
  }

  public int shortest(String word1, String word2) {
    List<Integer> idx1 = map.get(word1);
    List<Integer> idx2 = map.get(word2);
    int left = 0, right = 0, shortest = Integer.MAX_VALUE;

    while (left < idx1.size() && right < idx2.size()) {
      int num1 = idx1.get(left);
      int num2 = idx2.get(right);
      shortest = Math.min(shortest, Math.abs(num1 - num2));
      if (shortest == 1) {
        return 1;
      }
      if (num1 < num2) {
        left++;
      } else {
        right++;
      }
    }
    return shortest;
  }
}
