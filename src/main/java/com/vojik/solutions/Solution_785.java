package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 785. Is Graph Bipartite?
 */
public class Solution_785 {

  // Time: O(n) Space: O(n)
  public boolean isBipartite(int[][] graph) {
    // 0 - no filled
    // 1 - red color
    // -1 - blue color
    int[] colors = new int[graph.length];

    for (int i = 0; i < graph.length; i++) {
      if (colors[i] == 0) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        colors[i] = 1;

        while (!q.isEmpty()) {
          int node = q.poll();
          for (int next : graph[node]) {
            if (colors[next] == colors[node]) {
              return false;
            } else if (colors[next] == 0) {
              colors[next] = -colors[node];
              q.add(next);
            }
          }
        }
      }
    }
    return true;
  }
}
