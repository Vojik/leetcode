package com.vojik.solutions;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 1792. Maximum Average Pass Ratio
 */
public class Solution_1792 {

  public double maxAverageRatio(int[][] classes, int extraStudents) {
    PriorityQueue<int[]> minHeap = new PriorityQueue<>(
        (a, b) -> {
          double first = (a[0] + 1)/(double)(a[1] + 1) - (a[0])/(double)(a[1]);
          double second = (b[0] + 1)/(double)(b[1] + 1) - (b[0])/(double)(b[1]);
          return Double.compare(second, first);
        });

    Collections.addAll(minHeap, classes);

    while (extraStudents > 0) {
      int[] c = minHeap.poll();
      ++c[1];
      ++c[0];
      minHeap.add(c);
      extraStudents--;
    }

    double result = 0;
    int numOfClasses = classes.length;
    while (!minHeap.isEmpty()) {
      int[] c = minHeap.poll();
      result += getAvg(c[0], c[1]);
    }
    return result / numOfClasses;
  }

  private double getAvg(int pass, int total) {
    return (double) pass / total;
  }
}


