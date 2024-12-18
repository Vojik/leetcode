package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 2558. Take Gifts From the Richest Pile
 */
public class Solution_2558 {

  public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    for (int g : gifts) {
      pq.add(g);
    }
    for (int i = 0; i < k; i++) {
      pq.add((int) Math.sqrt(pq.poll()));
    }
    long ans = 0;
    while (!pq.isEmpty()) {
      ans += pq.poll();
    }
    return ans;
  }
}
