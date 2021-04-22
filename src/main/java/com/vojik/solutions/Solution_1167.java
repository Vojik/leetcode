package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 1167. Minimum Cost to Connect Sticks
 */
public class Solution_1167 {

  public int connectSticks(int[] sticks) {
    if (sticks == null || sticks.length == 0) {
      return 0;
    }

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int i = 0; i < sticks.length; i++) {
      minHeap.add(sticks[i]);
    }
    int ans = 0;

    while (minHeap.size() > 1) {
      int first = minHeap.poll();
      int second = minHeap.poll();

      int newStick = first + second;
      minHeap.add(newStick);
      ans += newStick;
    }
    return ans;
  }
}
