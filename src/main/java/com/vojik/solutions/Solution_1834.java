package com.vojik.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 1834. Single-Threaded CPU
 */
public class Solution_1834 {

  public int[] getOrder(int[][] tasks) {
    int len = tasks.length;
    int[][] sortedTasks = new int[len][3];
    for (int i = 0; i < len; i++) {
      sortedTasks[i][0] = tasks[i][0];
      sortedTasks[i][1] = tasks[i][1];
      sortedTasks[i][2] = i;
    }
    Arrays.sort(sortedTasks, (a, b) -> a[0] - b[0]);

    PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
      if (a[1] != b[1]) {
        return a[1] - b[1];
      }
      return a[2] - b[2];
    });
    int[] answer = new int[len];

    int taskCursor = 0, currentTime = 0, i = 0;
    while (taskCursor < len || !heap.isEmpty()) {
      if (heap.isEmpty() && currentTime < sortedTasks[taskCursor][0]) {
        currentTime = sortedTasks[taskCursor][0];
      }

      while (taskCursor < len && sortedTasks[taskCursor][0] <= currentTime) {
        heap.add(sortedTasks[taskCursor]);
        taskCursor++;
      }

      int[] t = heap.poll();
      answer[i++] = t[2];
      currentTime += t[1];
    }
    return answer;
  }
}
