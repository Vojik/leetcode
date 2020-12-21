package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 *
 * <p>Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if
 * the input string is valid.
 *
 * <p>An input string is valid if:
 *
 * <p>Open brackets must be closed by the same type of brackets. Open brackets must be closed in
 * the correct order.
 *
 * <p>Example 1:
 *
 * <p>Input: s = "()" Output: true Example 2:
 *
 * <p>Input: s = "()[]{}" Output: true Example 3:
 *
 * <p>Input: s = "(]" Output: false Example 4:
 *
 * <p>Input: s = "([)]" Output: false Example 5:
 *
 * <p>Input: s = "{[]}" Output: true
 *
 * <p>Constraints:
 *
 * <p>1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
 */
public class Solution_20 {

  private Map<Character, Character> mapper;

  public Solution_20() {
    mapper = new HashMap<>();
    mapper.put('(', ')');
    mapper.put('[', ']');
    mapper.put('{', '}');
  }

  // Time: O(n) Space: O(n)
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
        continue;
      }

      if (stack.empty()) {
        return false;
      }
      char top = stack.pop();
      if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
        return false;
      }
    }
    return stack.empty();
  }

  // Time: O(n) Space: O(n)
  public boolean isValid2(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (mapper.containsKey(ch)) {
        stack.push(ch);
        continue;
      }

      if (stack.empty()) {
        return false;
      }
      Character top = stack.pop();
      if (mapper.get(top) != top) {
        return false;
      }
    }
    return stack.empty();
  }
}
