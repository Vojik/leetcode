package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 227. Basic Calculator II
 */
public class Solution_227 {

  // Time: O(n)
  // Space: O(n)
  public int calculate(String s) {
    Deque<Integer> stack = new ArrayDeque<>();
    int len = s.length();
    char lastOperation = '+';
    int number = 0;

    for (int i = 0; i < len; i++) {
      char currentChar = s.charAt(i);
      if (Character.isDigit(currentChar)) {
        // build number
        number = number * 10 + currentChar - '0';
      }
      if (i == len - 1 || !Character.isDigit(currentChar) && !Character.isWhitespace(currentChar)) {
        // handle operation

        if (lastOperation == '+') {
          stack.push(number);
        } else if (lastOperation == '-') {
          stack.push(-number);
        } else if (lastOperation == '*') {
          stack.push(stack.pop() * number);
        } else if (lastOperation == '/') {
          stack.push(stack.pop() / number);
        }
        lastOperation = currentChar;
        number = 0;
      }
    }

    int result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }
    return result;
  }
}
