package com.vojik.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** 261. Graph Valid Tree */
public class Solution_261 {

  public boolean validTree(int n, int[][] edges) {
    if (edges.length != n - 1) {
      return false;
    }
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    for (int i = 0; i < n; i++) {
      graph.put(i, new HashSet<>());
    }
    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }

    Queue<Integer> queue = new LinkedList<>();
    Map<Integer, Integer> parent = new HashMap<>();
    queue.add(0);
    parent.put(0, -1);

    while (!queue.isEmpty()) {
      int node = queue.poll();
      for (int next : graph.get(node)) {
        if (parent.get(node) == next) {
          continue;
        }
        if (parent.containsKey(next)) {
          return false;
        }

        queue.add(next);
        parent.put(next, node);
      }
    }
    return parent.size() == n;
  }
}
