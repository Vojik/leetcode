package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 3264. Final Array State After K Multiplication Operations I
 */
public class Solution_3264 {

  public int[] getFinalState(int[] nums, int k, int multiplier) {
    PriorityQueue<int[]> minHeap = new PriorityQueue<>(
        (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
    for (int i = 0; i < nums.length; i++) {
      minHeap.add(new int[]{nums[i], i});
    }

    while (k > 0 && !minHeap.isEmpty()) {
      int[] cur = minHeap.poll();
      cur[0] *= multiplier;
      minHeap.add(cur);
      nums[cur[1]] = cur[0];
      k--;
    }
    return nums;
  }

}
