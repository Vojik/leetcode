package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 * 433. Minimum Genetic Mutation
 */
public class Solution_433 {

  public int minMutation(String startGene, String endGene, String[] bank) {
    Set<String> set = new HashSet<>();
    for (String str : bank) {
      set.add(str);
    }

    if (!set.contains(endGene)) {
      return -1;
    }

    Deque<String> deque = new ArrayDeque<>();
    deque.addFirst(startGene);
    int ans = 0;

    while (!deque.isEmpty()) {
      int size = deque.size();
      for (int i = 0; i < size; i++) {
        String current = deque.removeLast();
        if (current.equals(endGene)) {
          return ans;
        }
        for (int j = 0; j < current.length(); j++) {
          for (char ch : new char[]{'A', 'C', 'G', 'T'}) {
            if (ch == current.charAt(j)) {
              continue;
            }
            String newGene = current.substring(0, j) + ch + current.substring(j + 1);
            if (set.contains(newGene)) {
              deque.addFirst(newGene);
              set.remove(newGene);
            }
          }
        }
      }
      ans++;
    }

    return -1;
  }
}
