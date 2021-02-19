package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 */
public class Solution_703WithPriorityQueue {

  private PriorityQueue<Integer> minHeap;
  private int k;

  public Solution_703WithPriorityQueue(int k, int[] nums) {
    this.k = k;
    this.minHeap = new PriorityQueue<>();
    for (int n : nums) {
      minHeap.add(n);
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }
  }

  public int add(int val) {
    minHeap.add(val);
    if (minHeap.size() > k) {
      minHeap.poll();
    }
    return minHeap.peek();
  }
}