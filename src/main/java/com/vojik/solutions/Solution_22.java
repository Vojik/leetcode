package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 22. Generate Parentheses
 */
public class Solution_22 {

  public List<String> generateParenthesisRecursive(int n) {
    return generateParenthesis(n, n, "", new ArrayList<>());
  }

  private List<String> generateParenthesis(int open, int close, String str, List<String> result) {
    if (open == 0 && close == 0) {
      result.add(str);
      return result;
    }
    if (close > open) {
      generateParenthesis(open, close - 1, str + ")", result);
    }
    if (open > 0) {
      generateParenthesis(open - 1, close, str + "(", result);
    }
    return result;
  }

  // Time: O()
  public List<String> generateParenthesisIteratively(int n) {
    List<String> result = new ArrayList<>();
    Deque<String> deque = new ArrayDeque<>();
    deque.addFirst(n - 1 + "" + n + "" + "("); // save string as OpenCloseString

    while (!deque.isEmpty()) {
      String str = deque.removeFirst();

      int open = Character.getNumericValue(str.charAt(0));
      int close = Character.getNumericValue(str.charAt(1));

      if (open == 0 && close == 0) {
        result.add(str.substring(2));
        continue;
      }

      if (close > open) {
        deque.addFirst(open + "" + (close - 1) + "" + str.substring(2) + ")");
      }
      if (open > 0) {
        deque.addFirst((open - 1) + "" + close + "" + str.substring(2) + "(");
      }

    }
    return result;

  }
}
