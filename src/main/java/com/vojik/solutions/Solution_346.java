package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 346. Moving Average from Data Stream
 */
public class Solution_346 {

  class MovingAverage {

    private int maxSize;
    private int currentSize;
    private int prefixSum;
    private Deque<Integer> deque = new ArrayDeque<>();

    public MovingAverage(int size) {
      this.maxSize = size;
      this.currentSize = 0;
      this.prefixSum = 0;
    }

    public double next(int val) {
      deque.addLast(val);
      currentSize++;
      prefixSum += val;
      if (currentSize > maxSize) {
        prefixSum -= deque.removeFirst();
        currentSize--;
      }
      return (double) prefixSum / currentSize;
    }
  }
}
