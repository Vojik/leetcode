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
    for (int i = 1; i < parts.length; i++) {
      String str = parts[i];
      if (str.isBlank() || str.equals(".")) {
        continue;
      } else if (str.equals("..")) {
        if (!deque.isEmpty()) {
          deque.pollLast();
        }
      } else {
        deque.addLast(str);
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append("/");
    while (!deque.isEmpty()) {
      sb.append(deque.pollFirst());
      sb.append("/");
    }
    if (sb.length() > 1) {
      sb.deleteCharAt(sb.length() - 1);
    }
    return sb.toString();
  }
}
