package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/** 210. Course Schedule II */
public class Solution_210 {
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    Map<Integer, Integer> inDegree = new HashMap<>();
    for (int i = 0; i < numCourses; i++) {
      graph.put(i, new ArrayList<>());
      inDegree.put(i, 0);
    }

    for (int[] courses : prerequisites) {
      int first = courses[1];
      int second = courses[0];
      List<Integer> nextCourses = graph.get(first);
      nextCourses.add(second);
      graph.put(first, nextCourses);
      inDegree.put(second, inDegree.get(second) + 1);
    }

    Queue<Integer> queue = new LinkedList<>();
    for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
      if (entry.getValue() == 0) {
        queue.add(entry.getKey());
      }
    }

    int[] result = new int[numCourses];
    int idx = 0;
    while (!queue.isEmpty()) {
      int course = queue.poll();
      result[idx++] = course;

      List<Integer> nextCourses = graph.get(course);
      for (int c : nextCourses) {
        inDegree.put(c, inDegree.get(c) - 1);
        if (inDegree.get(c) == 0) {
          queue.add(c);
        }
      }
    }

    return idx == numCourses ? result : new int[] {};
  }
}
