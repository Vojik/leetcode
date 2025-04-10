package com.vojik.solutions;


import java.util.Stack;

/**
 * 1944. Number of Visible People in a Queue
 */
public class Solution_1944 {

  public int[] canSeePersonsCount(int[] heights) {
    int len = heights.length;
    int[] ans = new int[len];
    Stack<Integer> stack = new Stack();
    for (int i = len - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() < heights[i]) {
        ans[i]++;
        stack.pop();
      }
      ans[i] += stack.isEmpty() ? 0 : 1;
      stack.push(heights[i]);
    }

    return ans;
  }
}


