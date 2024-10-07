package com.vojik.solutions;

import java.util.Stack;

/**
 * 2696. Minimum String Length After Removing Substrings
 */
public class Solution_2696 {

  public int minLength(String s) {
    Stack<Character> stack = new Stack<>();
    for (char ch : s.toCharArray()) {
      if ((ch == 'B' && !stack.isEmpty() && stack.peek() == 'A') || (ch == 'D' && !stack.isEmpty()
          && stack.peek() == 'C')) {
        stack.pop();
      } else {
        stack.push(ch);
      }
    }
    return stack.size();
  }
}
