package com.vojik.solutions;

import java.util.PriorityQueue;

/** 1046. Last Stone Weight */
public class Solution_1046 {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
    for (int s : stones) {
      maxHeap.add(s);
    }

    while (maxHeap.size() > 1) {
      int y = maxHeap.poll();
      int x = maxHeap.poll();
      if (y != x) {
        maxHeap.add(y - x);
      }
    }
    return maxHeap.size() == 1 ? maxHeap.poll() : 0;
  }
}
