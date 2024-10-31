package com.vojik.solutions;

import java.util.List;

/**
 * 339. Nested List Weight Sum
 */
public class Solution_339 {

  public int depthSum(List<NestedInteger> nestedList) {
    return dfs(nestedList, 1);
  }

  private int dfs(List<NestedInteger> nestedList, int depth) {
    int sum = 0;
    for (NestedInteger el : nestedList) {
      if (el.isInteger()) {
        sum += el.getInteger() * depth;
      } else {
        sum += dfs(el.getList(), depth + 1);
      }
    }
    return sum;
  }
}


// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {

  // @return true if this NestedInteger holds a single integer, rather than a nested list.
  boolean isInteger();

  // @return the single integer that this NestedInteger holds, if it holds a single integer
  // Return null if this NestedInteger holds a nested list
  Integer getInteger();

  // Set this NestedInteger to hold a single integer.
  void setInteger(int value);

  // Set this NestedInteger to hold a nested list and adds a nested integer to it.
  void add(NestedInteger ni);

  // @return the nested list that this NestedInteger holds, if it holds a nested list
  // Return empty list if this NestedInteger holds a single integer
  List<NestedInteger> getList();
}
