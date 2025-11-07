package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 904. Fruit Into Baskets
 */
public class Solution_904 {

  public int totalFruit(int[] fruits) {
    int left = 0, right = 0, max = 0;
    Map<Integer, Integer> counter = new HashMap<>();
    while (right < fruits.length) {
      int fruitType = fruits[right];
      counter.put(fruitType, counter.getOrDefault(fruitType, 0) + 1);
      while (counter.size() > 2) {
        int leftKey = fruits[left];
        int count = counter.get(leftKey);
        if (count > 1) {
          counter.put(leftKey, count - 1);
        } else {
          counter.remove(leftKey);
        }
        left++;
      }
      max = Math.max(max, right - left + 1);
      right++;
    }
    return max;
  }
}
