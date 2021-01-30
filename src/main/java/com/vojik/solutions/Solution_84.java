package com.vojik.solutions;

import java.util.Stack;

/**
 * 84. Largest Rectangle in Histogram
 */
public class Solution_84 {

  // Time: O(n) Space: O(n)
  public int largestRectangleArea(int[] heights) {
    if (heights == null) {
      return 0;
    }
    if (heights.length == 1) {
      return heights[0];
    }

    Stack<Integer> stack = new Stack<>(); // hold position values with rising bars
    stack.push(-1);
    int max = 0;
    for (int i = 0; i < heights.length; i++) {
      int curHeight = heights[i];
      while (stack.peek() != -1 && curHeight < heights[stack.peek()]) {
        int h = heights[stack.pop()];
        int w = i - stack.peek() - 1;
        max = Math.max(max, h * w);
      }
      stack.push(i);
    }
    while (stack.peek() != -1) {
      int h = heights[stack.pop()];
      int w = heights.length - stack.peek() - 1;
      max = Math.max(max, h * w);
    }
    return max;
  }
}
