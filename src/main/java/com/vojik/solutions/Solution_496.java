package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 496. Next Greater Element I
 */
public class Solution_496 {

  // Time: O(m*n) Space: O(n)
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums2.length; i++) {
      map.put(nums2[i], i);
    }

    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int val = nums1[i];
      int j = map.get(nums1[i]);
      for (int k = j + 1; k < nums2.length; k++) {
        if (nums2[k] > val) {
          result[i] = nums2[k];
          break;
        }
      }
      if (result[i] == 0) {
        result[i] = -1;
      }
    }
    return result;
  }

  // Time: O(n) Space: O(n)
  public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < nums2.length; i++) {
      while (!deque.isEmpty() && nums2[i] > deque.getLast()) {
        map.put(deque.removeLast(), nums2[i]);
      }
      deque.addLast(nums2[i]);
    }

    while (!deque.isEmpty()) {
      map.put(deque.removeLast(), -1);
    }

    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      result[i] = map.get(nums1[i]);
    }
    return result;
  }
}
