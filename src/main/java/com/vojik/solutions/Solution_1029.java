package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 1029. Two City Scheduling
 */
public class Solution_1029 {

  public int twoCitySchedCost(int[][] costs) {
    int n = costs.length / 2;
    PriorityQueue<int[]> pqA = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    PriorityQueue<int[]> pqB = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    for (int[] c : costs) {
      if (c[0] < c[1]) {
        pqA.add(new int[]{c[1] - c[0], c[0], c[1]});
      } else {
        pqB.add(new int[]{c[0] - c[1], c[0], c[1]});
      }

      if (pqA.size() > n) {
        pqB.add(pqA.poll());
      } else if (pqB.size() > n) {
        pqA.add(pqB.poll());
      }
    }

    int sum = 0;
    while (!pqA.isEmpty()) {
      sum += pqA.poll()[1];
      sum += pqB.poll()[2];
    }
    return sum;
  }
}
