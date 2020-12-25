package com.vojik.solutions;

import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

/**
 * 150. Evaluate Reverse Polish Notation
 *
 * <p>Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * <p>Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 *
 * <p>Note:
 *
 * <p>Division between two integers should truncate toward zero. The given RPN expression is always
 * valid. That means the expression would always evaluate to a result and there won't be any divide
 * by zero operation. Example 1:
 *
 * <p>Input: ["2", "1", "+", "3", "*"] Output: 9 Explanation: ((2 + 1) * 3) = 9
 * <p>
 * Example 2:
 *
 * <p>Input: ["4", "13", "5", "/", "+"] Output: 6 Explanation: (4 + (13 / 5)) = 6
 * <p>
 * Example 3:
 *
 * <p>Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"] Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 = ((10 * (6 / (12 * -11))) + 17) + 5 = ((10
 * * (6 / -132)) + 17) + 5 = ((10 * 0) + 17) + 5 = (0 + 17) + 5 = 17 + 5 = 22
 */
public class Solution_150 {

  private static Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = Map
      .of("+", (a, b) -> a + b,
          "-", (a, b) -> a - b,
          "*", (a, b) -> a * b,
          "/", (a, b) -> a / b);


  public int evalRPN2(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < tokens.length; i++) {
      String val = tokens[i];
      if ("+-*/".contains(val)) {
        int num2 = stack.pop();
        int num1 = stack.pop();
        stack.push(OPERATIONS.get(val).apply(num1, num2));

      } else {
        stack.push(Integer.parseInt(val));
      }
    }
    return stack.pop();
  }

  // Time: O(n) Space: O(n/2)
  public int evalRPN(String[] tokens) {
    List<String> operators = List.of("+", "-", "*", "/");
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < tokens.length; i++) {
      String val = tokens[i];
      if (operators.contains(val)) {
        int num2 = stack.pop();
        int num1 = stack.pop();

        if (val.equals("+")) {
          stack.push(num1 + num2);
        } else if (val.equals("-")) {
          stack.push(num1 - num2);
        } else if (val.equals("*")) {
          stack.push(num1 * num2);
        } else if (val.equals("/")) {
          stack.push(num1 / num2);
        }

      } else {
        stack.push(Integer.parseInt(val));
      }
    }
    return stack.pop();
  }
}
