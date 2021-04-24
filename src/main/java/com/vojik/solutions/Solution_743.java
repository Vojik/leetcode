package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 743. Network Delay Time
 */
public class Solution_743 {

  public int networkDelayTime(int[][] times, int n, int k) {
    Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

    for (int[] edge: times) {
      graph.putIfAbsent(edge[0], new HashMap<>());
      graph.get(edge[0]).put(edge[1], edge[2]);
    }

    // graph: hubName -> (neighbourHub, distance to it)
    // e.g. 2 -> (1,1)
    //           (3,1)
    //      3 -> (4,1)

    int maxDelay = 0;
    int numVisited = 0;

    int[] distances = new int[n + 1];
    Arrays.fill(distances, Integer.MAX_VALUE);
    distances[k] = 0;

    boolean[] visited = new boolean[n + 1];

    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]); // [0] - hubName; [1] - distance
    minHeap.add(new int[]{k, 0});

    while (!minHeap.isEmpty()) {
      int[] hub = minHeap.poll();
      int curHub = hub[0];
      int curDistance = hub[1];
      if (visited[curHub]) {
        continue;
      }
      visited[curHub] = true;
      numVisited++;
      distances[curHub] = curDistance;
      maxDelay = curDistance;

      // update paths
      Map<Integer, Integer> neighbours = graph.get(curHub);
      if (neighbours == null) {
        continue;
      }
      for (Map.Entry<Integer, Integer> neighbour : neighbours.entrySet()) {
        // nextHub - distance
        if (!visited[neighbour.getKey()] && curDistance + neighbour.getValue() < distances[neighbour.getKey()]) {
          minHeap.add(new int[]{neighbour.getKey(), curDistance + neighbour.getValue()});
        }
      }

    }

    return numVisited == n ? maxDelay : -1;
  }
}
