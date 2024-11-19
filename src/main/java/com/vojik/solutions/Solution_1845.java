package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 1845. Seat Reservation Manager
 */
class Solution_1845 {

  private PriorityQueue<Integer> minHeap;

  public Solution_1845(int n) {
    this.minHeap = new PriorityQueue<>(n);
    for (int i = 1; i <= n; i++) {
      minHeap.add(i);
    }
  }

  public int reserve() {
    return minHeap.poll();
  }

  public void unreserve(int seatNumber) {
    minHeap.add(seatNumber);
  }
}
