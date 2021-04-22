package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 323. Number of Connected Components in an Undirected Graph
 */
public class Solution_323 {

  public int countComponents(int n, int[][] edges) {
    int ans = 0;
    boolean[] visited = new boolean[n];
    List<Integer>[] adjList = new ArrayList[n];
    for (int i = 0; i < n; i++) {
      adjList[i] = new ArrayList<>();
    }

    for (int i = 0; i < edges.length; i++) {
      adjList[edges[i][0]].add(edges[i][1]);
      adjList[edges[i][1]].add(edges[i][0]);
    }

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        dfs(i, visited, adjList);
        ans++;
      }
    }

    return ans;
  }

  private void dfs(int n, boolean[] visited, List<Integer>[] adjList) {
    List<Integer> comp = adjList[n];
    visited[n] = true;
    for (int c : comp) {
      if (!visited[c]) {
        dfs(c, visited, adjList);
      }
    }
  }
}
