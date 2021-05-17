package com.vojik.solutions;

import java.util.PriorityQueue;

/** 215. Kth Largest Element in an Array */
public class Solution_215 {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int i = 0; i < k; i++) {
      minHeap.add(nums[i]);
    }
    for (int i = k; i < nums.length; i++) {
      if (minHeap.peek() < nums[i]) {
        minHeap.add(nums[i]);
        minHeap.poll();
      }
    }
    return minHeap.peek();
  }
}
