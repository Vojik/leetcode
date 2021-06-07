package com.vojik.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 * 692. Top K Frequent Words
 */
public class Solution_692 {

  public List<String> topKFrequent(String[] words, int k) {
    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    PriorityQueue<Entry<String, Integer>> heap = new PriorityQueue<>((a,b) -> {
      if (b.getValue() != a.getValue()) {
        return a.getValue() - b.getValue();
      }
      return b.getKey().compareTo(a.getKey());
    });

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      heap.add(entry);
      if (heap.size() > k) {
        heap.poll();
      }
    }

    List<String> result = new LinkedList<>();
    while (!heap.isEmpty()) {
      result.add(0, heap.poll().getKey());
    }
    return result;
  }
}
