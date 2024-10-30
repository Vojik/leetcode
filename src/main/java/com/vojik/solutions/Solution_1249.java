package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 */
public class Solution_1249 {

  // Time: O(n) Space: O(n)
  public String minRemoveToMakeValid(String s) {
    StringBuilder sb = new StringBuilder();
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(') {
        stack.push(sb.length());
      } else if (ch == ')') {
        if (stack.isEmpty()) {
          continue;
        }
        stack.pop();
      }
      sb.append(ch);
    }

    while (!stack.isEmpty()) {
      sb.deleteCharAt(stack.pop());
    }

    return sb.toString();
  }

  public String minRemoveToMakeValid2(String s) {
    Stack<Integer> stack = new Stack<>();
    Set<Integer> indexesToRemove = new HashSet();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else if (s.charAt(i) == ')') {
        if (stack.isEmpty()) {
          indexesToRemove.add(i);
        } else {
          stack.pop();
        }
      }
    }

    while (!stack.isEmpty()) {
      indexesToRemove.add(stack.pop());
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (!indexesToRemove.contains(i)) {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }
}
