package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 295. Find Median from Data Stream
 */
public class Solution_295 {

  private final PriorityQueue<Integer> maxHeap; // holds first part of numbers
  private final PriorityQueue<Integer> minHeap; // holds first part of numbers

  /**
   * initialize your data structure here.
   */
  public Solution_295() {
    this.maxHeap = new PriorityQueue<>((a, b) -> b - a);
    this.minHeap = new PriorityQueue<>();
  }

  public void addNum(int num) {
    if (maxHeap.isEmpty() || maxHeap.peek() > num) {
      maxHeap.add(num);
    } else {
      minHeap.add(num);
    }

    if (maxHeap.size() > minHeap.size() + 1) {
      minHeap.add(maxHeap.poll());
    } else if (minHeap.size() > maxHeap.size()) {
      maxHeap.add(minHeap.poll());
    }
  }

  public double findMedian() {
    if ((minHeap.size() + maxHeap.size()) % 2 == 0) {
      return (double) (minHeap.peek() + maxHeap.peek()) / 2;
    }
    return maxHeap.peek();
  }
}
