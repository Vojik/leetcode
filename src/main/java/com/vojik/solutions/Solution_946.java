package com.vojik.solutions;

import java.util.Stack;

/**
 * 946. Validate Stack Sequences
 */
public class Solution_946 {

  // Time: O(n + m) Space: O(m)
  public boolean validateStackSequences(int[] pushed, int[] popped) {
    Stack<Integer> stack = new Stack<>();
    int j = 0;

    for (int i = 0; i < popped.length; i++) {
      if (!stack.isEmpty() && stack.peek() == popped[i]) {
        stack.pop();
      } else if (j >= pushed.length) {
        return false;
      } else {
        while (j < pushed.length && pushed[j] != popped[i]) {
          stack.push(pushed[j++]);
        }
        j++;
      }
    }
    return stack.isEmpty();
  }

  public boolean validateStackSequences2(int[] pushed, int[] popped) {
    Stack<Integer> stack = new Stack<>();
    int popIdx = 0;

    for (int i = 0; i < pushed.length; i++) {
      stack.push(pushed[i]);
      while (popIdx < popped.length && !stack.isEmpty() && stack.peek() == popped[popIdx]) {
        popIdx++;
        stack.pop();
      }
    }
    return stack.isEmpty();
  }
}
