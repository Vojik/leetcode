package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1209. Remove All Adjacent Duplicates in String II
 */
public class Solution_1209 {

  public String removeDuplicates(String s, int k) {
    Deque<Pair> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
      int count = !stack.isEmpty() && stack.getLast().ch == c ? stack.getLast().count + 1 : 1;
      stack.addLast(new Pair(c, count));

      if (stack.getLast().count == k) {
        for (int i = 0; i < k; ++i) {
          stack.removeLast();
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.removeLast().ch);
    }
    return sb.reverse().toString();
  }

  class Pair {

    char ch;
    int count;

    Pair(char ch, int count) {
      this.ch = ch;
      this.count = count;
    }
  }
}
