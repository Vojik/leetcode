package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 323. Number of Connected Components in an Undirected Graph
 *
 * <p>You have a graph of n nodes. You are given an integer n and an array edges where edges[i] =
 * [ai, bi] indicates that there is an edge between ai and bi in the graph.
 *
 * <p>Return the number of connected components in the graph.
 *
 * <p>Example 1:
 *
 * <p>Input: n = 5, edges = [[0,1],[1,2],[3,4]] Output: 2 Example 2:
 *
 * <p>Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]] Output: 1
 *
 * <p>Constraints:
 *
 * <p>1 <= n <= 2000 1 <= edges.length <= 5000 edges[i].length == 2 0 <= ai <= bi < n ai != bi There
 * are no repeated edges.
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
