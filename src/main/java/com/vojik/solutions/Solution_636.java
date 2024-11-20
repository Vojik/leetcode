package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * 636. Exclusive Time of Functions
 */
public class Solution_636 {

  // Time: O(N)
  // Space: O(n)
  public int[] exclusiveTime(int n, List<String> logs) {
    Deque<Integer> stack = new ArrayDeque<>();
    int[] ans = new int[n];
    int prevTime = 0;
    for (String log : logs) {
      String[] event = log.split(":");
      int funId = Integer.parseInt(event[0]);
      int currentTime = Integer.parseInt(event[2]);
      if (event[1].equals("start")) {
        if (!stack.isEmpty()) {
          ans[stack.getLast()] += currentTime - prevTime;
        }
        stack.addLast(funId);
        prevTime = currentTime;
      } else {
        ans[stack.removeLast()] += currentTime - prevTime + 1;
        prevTime = currentTime + 1;
      }
    }
    return ans;
  }
}
