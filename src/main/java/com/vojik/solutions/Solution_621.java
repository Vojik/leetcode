package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 621. Task Scheduler
 *
 * <p>Given a characters array tasks, representing the tasks a CPU needs to do, where each letter
 * represents a different task. Tasks could be done in any order. Each task is done in one unit of
 * time. For each unit of time, the CPU could complete either one task or just be idle.
 *
 * <p>However, there is a non-negative integer n that represents the cooldown period between two
 * same tasks (the same letter in the array), that is that there must be at least n units of time
 * between any two same tasks.
 *
 * <p>Return the least number of units of times that the CPU will take to finish all the given
 * tasks.
 *
 * <p>Example 1:
 *
 * <p>Input: tasks = ["A","A","A","B","B","B"], n = 2 Output: 8 Explanation: A -> B -> idle -> A ->
 * B -> idle -> A -> B There is at least 2 units of time between any two same tasks. Example 2:
 *
 * <p>Input: tasks = ["A","A","A","B","B","B"], n = 0 Output: 6 Explanation: On this case any
 * permutation of size 6 would work since n = 0. ["A","A","A","B","B","B"] ["A","B","A","B","A","B"]
 * ["B","B","B","A","A","A"] ... And so on. Example 3:
 *
 * <p>Input: tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2 Output: 16
 * Explanation: One possible solution is A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle ->
 * idle -> A -> idle -> idle -> A
 *
 * <p>Constraints:
 *
 * <p>1 <= task.length <= 104 tasks[i] is upper-case English letter. The integer n is in the range
 * [0, 100].
 */
public class Solution_621 {

  public int leastInterval(char[] tasks, int n) {
    int[] frequencies = new int[26];
    for (char c : tasks) {
      frequencies[c - 'A']++;
    }

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    for (int freq : frequencies) {
      if (freq > 0) {
        maxHeap.add(freq);
      }
    }

    int ans = 0;
    while (!maxHeap.isEmpty()) {
      int interval = n + 1;
      List<Integer> listForNextInterval = new ArrayList<>();
      while (!maxHeap.isEmpty() && interval > 0) {
        int count = maxHeap.poll();
        count--;
        if (count > 0) {
          listForNextInterval.add(count);
        }
        interval--;
        ans++;
      }

      maxHeap.addAll(listForNextInterval);

      if (maxHeap.isEmpty()) {
        break;
      }

      if (interval > 0) {
        ans += interval;
      }
    }
    return ans;
  }
}
