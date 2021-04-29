package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 973. K Closest Points to Origin
 */
public class Solution_973 {

  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
        (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
    for (int[] p : points) {
      maxHeap.add(p);
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }
    int[][] result = new int[k][2];
    while (!maxHeap.isEmpty() && k > 0) {
      result[--k] = maxHeap.poll();
    }
    return result;
  }
}
