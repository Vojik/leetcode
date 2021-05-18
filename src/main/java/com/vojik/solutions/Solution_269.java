package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/** 269. Alien Dictionary */
public class Solution_269 {

  public String alienOrder(String[] words) {
    Map<Character, List<Character>> graph = new HashMap<>();
    Map<Character, Integer> inDegree = new HashMap<>();
    for (String word : words) {
      for (int i = 0; i < word.length(); i++) {
        char letter = word.charAt(i);
        graph.put(letter, new ArrayList<>());
        inDegree.put(letter, 0);
      }
    }

    for (int i = 0; i < words.length - 1; i++) {
      for (int j = 0; j < Math.min(words[i].length(), words[i + 1].length()); j++) {
        if (words[i].length() > words[i + 1].length() && words[i].startsWith(words[i + 1])) {
          return "";
        }
        if (words[i].charAt(j) != words[i + 1].charAt(j)) {
          graph.get(words[i].charAt(j)).add(words[i + 1].charAt(j));
          inDegree.put(words[i + 1].charAt(j), inDegree.get(words[i + 1].charAt(j)) + 1);
          break;
        }
      }
    }

    Queue<Character> sources = new LinkedList<>();
    for (Map.Entry<Character, Integer> entry : inDegree.entrySet()) {
      if (entry.getValue() == 0) {
        sources.add(entry.getKey());
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!sources.isEmpty()) {
      char vertex = sources.poll();
      sb.append(vertex);
      List<Character> children = graph.get(vertex);
      for (Character child : children) {
        inDegree.put(child, inDegree.get(child) - 1);
        if (inDegree.get(child) == 0) {
          sources.add(child);
        }
      }
    }

    if (sb.length() != inDegree.size()) {
      return "";
    }
    return sb.toString();
  }
}
