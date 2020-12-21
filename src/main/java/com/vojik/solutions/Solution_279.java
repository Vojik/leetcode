package com.vojik.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 279. Perfect Squares
 *
 * <p>Given a positive integer n, find the least number of perfect square numbers (for example, 1,
 * 4, 9, 16, ...) which sum to n.
 *
 * <p>Example 1:
 *
 * <p>Input: n = 12 Output: 3 Explanation: 12 = 4 + 4 + 4.
 *
 * <p>Example 2:
 *
 * <p>Input: n = 13 Output: 2 Explanation: 13 = 4 + 9.
 */
public class Solution_279 {

  public int numSquares(int n) {
    int level = 0;
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();
    queue.add(0);

    int upperBound = (int) Math.sqrt(n);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int node = queue.poll();
        if (!visited.add(node)) {
          continue;
        }

        for (int j = 1; j <= upperBound; j++) {
          int next = node + j * j;
          if (next == n) {
            return ++level;
          }
          queue.add(next);
        }
      }
      level++;
    }
    return level;
  }
}
