package com.vojik.solutions;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 *
 * <p>Implement a first in first out (FIFO) queue using only two stacks. The implemented queue
 * should support all the functions of a normal queue (push, peek, pop, and empty).
 *
 * <p>Implement the MyQueue class:
 *
 * <p>void push(int x) Pushes element x to the back of the queue. int pop() Removes the element
 * from the front of the queue and returns it. int peek() Returns the element at the front of the
 * queue. boolean empty() Returns true if the queue is empty, false otherwise. Notes:
 *
 * <p>You must use only standard operations of a stack, which means only push to top, peek/pop from
 * top, size, and is empty operations are valid. Depending on your language, the stack may not be
 * supported natively. You may simulate a stack using a list or deque (double-ended queue) as long
 * as you use only a stack's standard operations. Follow-up: Can you implement the queue such that
 * each operation is amortized O(1) time complexity? In other words, performing n operations will
 * take overall O(n) time even if one of those operations may take longer.
 */
public class Solution_232 {

  private Stack<Integer> s1;
  private Stack<Integer> s2;

  /**
   * Initialize your data structure here.
   */
  public Solution_232() {
    this.s1 = new Stack<>();
    this.s2 = new Stack<>();
  }

  /**
   * Push element x to the back of queue.
   */
  public void push(int x) {
    if (!s1.empty()) {
      while (!s1.empty()) {
        s2.push(s1.pop());
      }
    }
    s2.push(x);
  }

  /**
   * Removes the element from in front of queue and returns that element.
   */
  public int pop() {
    this.peek();
    return s1.pop();
  }

  /**
   * Get the front element.
   */
  public int peek() {
    if (s1.empty()) {
      while (!s2.empty()) {
        s1.push(s2.pop());
      }
    }
    return s1.peek();
  }

  /**
   * Returns whether the queue is empty.
   */
  public boolean empty() {
    return s1.empty() && s2.empty();
  }
}
