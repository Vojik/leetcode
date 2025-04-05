package com.vojik.solutions;

import java.util.Stack;

/**
 * 155. Min Stack
 *
 * <p>Design a stack that supports push, pop, top, and retrieving the minimum element in constant
 * time.
 *
 * <p>push(x) -- Push element x onto stack. pop() -- Removes the element on top of the stack. top()
 * -- Get the top element. getMin() -- Retrieve the minimum element in the stack.
 *
 * <p>Example 1:
 *
 * <p>Input ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * <p>Output [null,null,null,null,-3,null,0,-2]
 *
 * <p>Explanation MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
 * minStack.push(-3); minStack.getMin(); // return -3 minStack.pop(); minStack.top(); // return 0
 * minStack.getMin(); // return -2
 *
 * <p>Constraints:
 *
 * <p>Methods pop, top and getMin operations will always be called on non-empty stacks.
 */
public class Solution_155 {

  private Stack<Node> stack;

  public Solution_155() {
    this.stack = new Stack<>();
  }

  public void push(int val) {
    if (stack.isEmpty()) {
      stack.push(new Node(val, val));
    } else {
      int minSoFar = stack.peek().min;
      stack.push(new Node(val, Math.min(val, minSoFar)));
    }
  }

  public void pop() {
    stack.pop();
  }

  public int top() {
    return stack.peek().val;
  }

  public int getMin() {
    return stack.peek().min;
  }

  class Node {

    int val;
    int min;

    Node(int val, int min) {
      this.val = val;
      this.min = min;
    }
  }
}
