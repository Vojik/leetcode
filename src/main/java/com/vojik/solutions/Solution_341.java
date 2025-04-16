package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/** 341. Flatten Nested List Iterator */
public class Solution_341 implements Iterator<Integer> {

  private final List<Integer> innerList = new ArrayList<>();
  private int i = 0;

  public Solution_341(List<NestedInteger> nestedList) {
    unwrap(nestedList);
  }

  private void unwrap(List<NestedInteger> nestedList) {
    for (NestedInteger ni : nestedList) {
      if (ni.isInteger()) {
        innerList.add(ni.getInteger());
      } else {
        unwrap(ni.getList());
      }
    }
  }

  @Override
  public Integer next() {
    if (!hasNext()) {
      throw new NoSuchElementException("error");
    }
    return innerList.get(i++);
  }

  @Override
  public boolean hasNext() {
    return i < innerList.size();
  }
}
