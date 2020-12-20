package com.vojik.solutions;

import java.util.Stack;

public class Solution_844 {

  // Time: O(n + m) Space: O(n + m)
  public boolean backspaceCompare1(String S, String T) {
    if (S.length() < T.length()) {
      return backspaceCompare1(T, S);
    }

    Stack<Character> stackS = new Stack<>();
    Stack<Character> stackT = new Stack<>();

    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '#') {
        if (!stackS.empty()) {
          stackS.pop();
        }
      } else {
        stackS.push(S.charAt(i));
      }

      if (i < T.length()) {
        if (T.charAt(i) == '#') {
          if (!stackT.empty()) {
            stackT.pop();
          }
        } else {
          stackT.push(T.charAt(i));
        }
      }
    }

    while (!stackS.empty()) {
      if (stackT.empty()) {
        return false;
      }

      if (!stackS.pop().equals(stackT.pop())) {
        return false;
      }
    }

    if (!stackT.empty()) {
      return false;
    }

    return true;
  }

  // Time: O(n) Space: O(1)
  public boolean backspaceCompare2(String S, String T) {
    int backspaceCounterS = 0;
    int backspaceCounterT = 0;

    int i = S.length() - 1;
    int j = T.length() - 1;

    while (i >= 0 || j >= 0) {

      while (i >= 0) {
        if (S.charAt(i) == '#') {
          backspaceCounterS++;
          i--;
        } else if (backspaceCounterS > 0) {
          backspaceCounterS--;
          i--;
        } else {
          break;
        }
      }

      while (j >= 0) {
        if (T.charAt(j) == '#') {
          backspaceCounterT++;
          j--;
        } else if (backspaceCounterT > 0) {
          backspaceCounterT--;
          j--;
        } else {
          break;
        }
      }

      if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j)) {
        return false;
      }

      if ((i >= 0) != (j >= 0)) {
        return false;
      }

      i--;
      j--;
    }
    return true;
  }
}
