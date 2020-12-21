package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

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

  private List<Integer> stack;

  /**
   * initialize your data structure here.
   */
  public Solution_155() {
    stack = new ArrayList<>();
  }

  public void push(int x) {
    stack.add(x);
  }

  public void pop() {
    stack.remove(stack.size() - 1);
  }

  public int top() {
    return stack.get(stack.size() - 1);
  }

  public int getMin() {
    int min = stack.get(0);
    for (int i = 1; i < stack.size(); i++) {
      min = Math.min(min, stack.get(i));
    }
    return min;
  }
}
