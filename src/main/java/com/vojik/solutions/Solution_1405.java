package com.vojik.solutions;

import java.util.PriorityQueue;
import java.util.Queue;

/** 1405. Longest Happy String */
public class Solution_1405 {

  public String longestDiverseString(int a, int b, int c) {
    Queue<int[]> maxHeap = new PriorityQueue<>((x, y) -> y[1] - x[1]);
    if (a > 0) {
      maxHeap.add(new int[] {0, a});
    }
    if (b > 0) {
      maxHeap.add(new int[] {1, b});
    }
    if (c > 0) {
      maxHeap.add(new int[] {2, c});
    }

    StringBuilder result = new StringBuilder();
    int lastChar = -1;
    while (!maxHeap.isEmpty()) {
      int[] top = maxHeap.poll();
      if (top[0] != lastChar) {
        // add from top
        if (top[1] > 1) {
          result.append((char) ('a' + top[0]));
          result.append((char) ('a' + top[0]));
          top[1] -= 2;
        } else {
          result.append((char) ('a' + top[0]));
          top[1] -= 1;
        }
        lastChar = top[0];
        if (top[1] > 0) {
          maxHeap.add(top);
        }

      } else if (!maxHeap.isEmpty()) {
        int[] next = maxHeap.poll();
        result.append((char) ('a' + next[0]));
        next[1] -= 1;
        lastChar = next[0];
        maxHeap.add(top);
        if (next[1] > 0) {
          maxHeap.add(next);
        }
      }
    }
    return result.toString();
  }
}
