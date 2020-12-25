package com.vojik.solutions;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 *
 * <p>Given a list of daily temperatures T, return a list such that, for each day in the input,
 * tells you how many days you would have to wait until a warmer temperature. If there is no future
 * day for which this is possible, put 0 instead.
 *
 * <p>For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output
 * should be [1, 1, 4, 2, 1, 1, 0, 0].
 *
 * <p>Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an
 * integer in the range [30, 100].
 */
public class Solution_739 {

  public int[] dailyTemperatures1(int[] T) {
    int[] answer = new int[T.length];
    Stack<Integer> stack = new Stack<>();
    for (int i = T.length - 1; i >= 0; i--) {
      while (!stack.empty() && T[i] >= T[stack.peek()]) {
        stack.pop();
      }
      answer[i] = stack.empty() ? 0 : stack.peek() - i;
      stack.push(i);
    }
    return answer;
  }


  // Time: O(n^2) Space: O(1)
  public int[] dailyTemperatures2(int[] T) {
    for (int i = 0; i < T.length; i++) {
      int cur = T[i];
      int diff = 0;
      for (int j = i + 1; j < T.length; j++) {
        if (cur < T[j]) {
          diff = j - i;
          break;
        }
      }
      T[i] = diff;
    }
    return T;
  }
}
