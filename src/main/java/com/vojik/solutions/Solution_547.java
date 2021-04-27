package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 547. Number of Provinces
 */
public class Solution_547 {

  public int findCircleNum(int[][] isConnected) {
    int province = 0;
    boolean[] visited = new boolean[isConnected.length];
    for (int i = 0; i < isConnected.length; i++) {
      if (!visited[i]) {
        bfs(isConnected, i, visited);
        province++;
      }

    }
    return province;
  }

  private void bfs(int[][] isConnected, int city, boolean[] visited) {
    Queue<Integer> connected = new LinkedList<>();
    connected.add(city);

    while (!connected.isEmpty()) {
      int c = connected.poll();
      int[] cities = isConnected[c];
      visited[c] = true;

      for (int k = 0; k < cities.length; k++) {
        if (cities[k] == 1 && !visited[k] && city != k) {
          connected.add(k);
        }
      }
    }
  }
}
