package com.vojik.datastructure;

import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

  private List[] array;
  private int size = 10000;

  /**
   * Initialize your data structure here.
   */
  public MyHashSet() {
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
