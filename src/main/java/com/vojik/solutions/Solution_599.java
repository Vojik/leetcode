package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 599. Minimum Index Sum of Two Lists
 */
public class Solution_599 {

  // Time: O(n) Space: O(n)
  public String[] findRestaurant(String[] list1, String[] list2) {
    if (list2.length < list1.length) {
      return findRestaurant(list2, list1);
    }

    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < list1.length; i++) {
      map.put(list1[i], i);
    }

    String[] result = new String[list1.length];
    int len = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < list2.length; i++) {
      if (i > min) {
        break;
      }
      Integer idx = map.get(list2[i]);
      if (idx != null) {
        if (idx + i < min) {
          len = 0;
          result[len++] = list2[i];
          min = idx + i;
        } else if (idx + i == min) {
          result[len++] = list2[i];
        }
      }
    }
    return Arrays.copyOf(result, len);
  }
}
