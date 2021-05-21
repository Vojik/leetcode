package com.vojik.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/** 127. Word Ladder */
public class Solution_127 {

  // Time complexity: O(M^2 * N)
  // Space complexity: O(M^2 * N)
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Set<String> wordSet = new HashSet<>(wordList);
    if (!wordSet.contains(endWord)) {
      return 0;
    }

    Queue<String> queue = new LinkedList<>();
    queue.add(beginWord);
    int level = 1;
    while (!queue.isEmpty()) {

      int size = queue.size();
      for (int k = 0; k < size; k++) {
        String word = queue.poll();
        if (word.equals(endWord)) {
          return level;
        }
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
          char originalChar = wordChars[i];
          for (char c = 'a'; c <= 'z'; c++) {
            wordChars[i] = c;
            String candidate = String.valueOf(wordChars);
            if (wordSet.contains(candidate)) {
              queue.add(candidate);
              wordSet.remove(candidate);
            }
          }
          wordChars[i] = originalChar;
        }
      }
      level++;
    }
    return 0;
  }
}
