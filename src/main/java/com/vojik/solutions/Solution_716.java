package com.vojik.solutions;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 716. Max Stack
 */
public class Solution_716 {

  private TreeSet<int[]> valueSet;
  private TreeSet<int[]> orderSet;
  private int order = 0;

  public Solution_716() {
    Comparator<int[]> comparator = (a, b) -> {
      return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
    };
    this.valueSet = new TreeSet<>(comparator);
    this.orderSet = new TreeSet<>(comparator);
  }

  public void push(int x) {
    orderSet.add(new int[] {order, x});
    valueSet.add(new int[] {x, order});
    order++;
  }

  public int pop() {
    int[] res = orderSet.last();
    orderSet.remove(res);
    valueSet.remove(new int[] {res[1], res[0]});
    return res[1];
  }

  public int top() {
    return orderSet.last()[1];
  }

  public int peekMax() {
    return valueSet.last()[0];
  }

  public int popMax() {
    int[] res = valueSet.last();
    valueSet.remove(res);
    orderSet.remove(new int[] {res[1], res[0]});
    return res[0];
  }
}
