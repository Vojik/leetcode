package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 787. Cheapest Flights Within K Stops
 */
public class Solution_787 {

  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
    Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
    populateGraph(graph, flights);

    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    minHeap.add(new int[]{src, 0, K + 1});

    while (!minHeap.isEmpty()) {
      int[] current = minHeap.poll();
      int currentCity = current[0];
      int currentPrice = current[1];
      int currentStops = current[2];

      if (currentCity == dst) {
        return currentPrice;
      }
      if (currentStops <= 0) {
        continue;
      }

      Map<Integer, Integer> destinations = graph.get(currentCity);
      if (destinations == null) {
        continue;
      }
      for (Map.Entry<Integer, Integer> nextDest : destinations.entrySet()) {
        minHeap.add(
            new int[]{nextDest.getKey(), currentPrice + nextDest.getValue(), currentStops - 1});
      }
    }
    return -1;
  }

  private void populateGraph(Map<Integer, Map<Integer, Integer>> graph, int[][] flights) {
    for (int[] flight : flights) {
      graph.putIfAbsent(flight[0], new HashMap<>());
      graph.get(flight[0]).put(flight[1], flight[2]);
    }
  }
}
