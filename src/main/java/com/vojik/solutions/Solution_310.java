package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** 310. Minimum Height Trees */
public class Solution_310 {

  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    if (n == 1) {
      return Collections.singletonList(0);
    }
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    int[] indegree = new int[n];
    for (int[] edge : edges) {
      indegree[edge[0]]++;
      indegree[edge[1]]++;
      graph.putIfAbsent(edge[0], new HashSet<>());
      graph.putIfAbsent(edge[1], new HashSet<>());
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      if (indegree[i] == 1) {
        queue.add(i);
      }
    }
    while (n > 2) {
      int size = queue.size();
      n -= size;
      for (int i = 0; i < size; i++) {
        int node = queue.poll();
        for (int next : graph.get(node)) {
          indegree[next]--;
          if (indegree[next] == 1) {
            queue.add(next);
          }
        }
      }
    }
    return new ArrayList(queue);
  }

  private Map<Integer, Set<Integer>> buildGraph(int n, int[][] edges) {
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    for (int[] edge : edges) {
      graph.putIfAbsent(edge[0], new HashSet<>());
      graph.putIfAbsent(edge[1], new HashSet<>());
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }
    return graph;
  }
}
