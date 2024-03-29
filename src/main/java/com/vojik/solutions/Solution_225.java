package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. Implement Stack using Queues
 *
 * <p>Implement a last in first out (LIFO) stack using only two queues. The implemented stack
 * should
 * support all the functions of a normal queue (push, top, pop, and empty).
 *
 * <p>Implement the MyStack class:
 *
 * <p>void push(int x) Pushes element x to the top of the stack. int pop() Removes the element on
 * the top of the stack and returns it. int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise. Notes:
 *
 * <p>You must use only standard operations of a queue, which means only push to back, peek/pop
 * from
 * front, size, and is empty operations are valid. Depending on your language, the queue may not be
 * supported natively. You may simulate a queue using a list or deque (double-ended queue), as long
 * as you use only a queue's standard operations.
 *
 * <p>Example 1:
 *
 * <p>Input ["MyStack", "push", "push", "top", "pop", "empty"] [[], [1], [2], [], [], []] Output
 * [null, null, null, 2, 2, false]
 *
 * <p>Explanation MyStack myStack = new MyStack(); myStack.push(1); myStack.push(2); myStack.top();
 * // return 2 myStack.pop(); // return 2 myStack.empty(); // return False
 *
 * <p>Constraints:
 *
 * <p>1 <= x <= 9 At most 100 calls will be made to push, pop, top, and empty. All the calls to pop
 * and top are valid.
 *
 * <p>Follow-up: Can you implement the stack such that each operation is amortized O(1) time
 * complexity? In other words, performing n operations will take overall O(n) time even if one of
 * those operations may take longer. You can use more than two queues.
 */
public class Solution_225 {

  private Queue<Integer> q1;
  private Queue<Integer> q2;
  private int front = Integer.MIN_VALUE;


  /**
   * Initialize your data structure here.
   */
  public Solution_225() {
    q1 = new LinkedList<>();
    q2 = new LinkedList<>();
  }

  /**
   * Push element x onto stack.
   */
  public void push(int x) {
    q1.add(x);
    front = x;
  }

  /**
   * Removes the element on top of the stack and returns that element.
   */
  public int pop() {
    if (q2.isEmpty()) {
      while (!q1.isEmpty() && q1.size() != 1) {
        front = q1.remove();
        q2.add(front);
      }
      return q1.remove();
    } else {
      while (!q2.isEmpty() && q2.size() != 1) {
        front = q2.remove();
        q1.add(front);
      }
      return q2.remove();
    }
  }

  /**
   * Get the top element.
   */
  public int top() {
    return front;
  }

  /**
   * Returns whether the stack is empty.
   */
  public boolean empty() {
    return q1.isEmpty() && q2.isEmpty();
  }
}
