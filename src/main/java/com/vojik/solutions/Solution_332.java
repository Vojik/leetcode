package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 332. Reconstruct Itinerary
 */
public class Solution_332 {

  public List<String> findItinerary(List<List<String>> tickets) {
    Map<String, PriorityQueue<String>> cityToDestination = new HashMap<>();
    for (List<String> t : tickets) {
      String origin = t.get(0);
      String destination = t.get(1);

      if (!cityToDestination.containsKey(origin)) {
        cityToDestination.put(origin, new PriorityQueue<String>());
      }
      cityToDestination.get(origin).add(destination);
    }

    List<String> result = new LinkedList<>();
    Deque<String> deque = new ArrayDeque<>();
    deque.addLast("JFK");

    while (!deque.isEmpty()) {
      while (cityToDestination.containsKey(deque.getLast()) && !cityToDestination.get(
          deque.getLast()).isEmpty()) {
        String next = cityToDestination.get(deque.getLast()).poll();
        deque.addLast(next);
      }
      result.add(0, deque.removeLast());
    }
    return result;
  }
}
