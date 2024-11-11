package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 71. Simplify Path
 */
public class Solution_71 {

  public String simplifyPath(String path) {
    Deque<String> deque = new ArrayDeque<>();
    final String[] parts = path.split("/");
    for (String directory : parts) {
      if (directory.isEmpty() || directory.equals(".")) {
        continue;
      } else if (directory.equals("..")) {
        deque.pollLast();
      } else {
        deque.addLast(directory);
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!deque.isEmpty()) {
      sb.append("/");
      sb.append(deque.pollFirst());
    }
    return sb.length() > 1 ? sb.toString() : "/";
  }
}
