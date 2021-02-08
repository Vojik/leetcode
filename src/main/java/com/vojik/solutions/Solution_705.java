package com.vojik.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * 705. Design HashSet
 */
public class Solution_705 {

  private List[] array;
  private int size = 10000;

  /**
   * Initialize your data structure here.
   */
  public Solution_705() {
    this.array = new LinkedList[size];
  }

  public void add(int key) {
    int bucket = hashCode(key);
    List<Integer> list = array[bucket];
    if (list == null) {
      list = new LinkedList<>();
    }
    if (!contains(key)) {
      list.add(key);
      array[bucket] = list;
    }
  }

  public void remove(int key) {
    int bucket = hashCode(key);
    List<Integer> list = array[bucket];
    if (list != null && contains(key)) {
      list.remove((Integer) key);
      array[bucket] = list;
    }
  }

  /**
   * Returns true if this set contains the specified element
   */
  public boolean contains(int key) {
    int bucket = hashCode(key);
    List<Integer> list = array[bucket];
    return list != null && list.contains(key);
  }

  private int hashCode(int key) {
    return key % size;
  }
}
