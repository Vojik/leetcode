package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 224. Basic Calculator
 */
public class Solution_224 {

  public int calculate(String s) {
    int result = 0;
    Deque<Integer> stack = new ArrayDeque<>();
    int sign = 1; // 1: +; -1: -

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (Character.isDigit(currentChar)) {
        int num = 0;
        int idx = i;
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
          num = num * 10 + s.charAt(idx) - '0';
          idx++;
        }
        result += sign * num;
        i = idx - 1;
      } else if (currentChar == '+') {
        sign = 1;
      } else if (currentChar == '-') {
        sign = -1;
      } else if (currentChar == '(') {
        stack.addLast(result);
        stack.addLast(sign);
        result = 0;
        sign = 1;
      } else if (currentChar == ')') {
        result = stack.removeLast() * result + stack.removeLast();
      }
    }
    return result;
  }
}
