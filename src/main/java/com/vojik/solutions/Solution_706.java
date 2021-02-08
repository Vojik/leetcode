package com.vojik.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * 706. Design HashMap
 */
public class Solution_706 {

  private List[] array;
  private int size = 10000;

  /**
   * Initialize your data structure here.
   */
  public Solution_706() {
    this.array = new LinkedList[size];
  }

  class Entry {

    private int key;
    private int value;

    protected Entry(int key, int value) {
      this.key = key;
      this.value = value;
    }

    protected int getKey() {
      return this.key;
    }

    protected int getValue() {
      return this.value;
    }
  }

  /**
   * value will always be non-negative.
   */
  public void put(int key, int value) {
    int bucket = hashCode(key);
    List<Entry> list = array[bucket];
    if (list == null) {
      list = new LinkedList<>();
    }
    for (Entry e : list) {
      if (e.getKey() == key) {
        e.value = value;
        array[bucket] = list;
        return;
      }
    }

    list.add(new Entry(key, value));
    array[bucket] = list;
  }

  /**
   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping
   * for the key
   */
  public int get(int key) {
    int bucket = hashCode(key);
    List<Entry> list = array[bucket];
    if (list != null) {
      for (Entry entry : list) {
        if (entry.getKey() == key) {
          return entry.getValue();
        }
      }
    }
    return -1;
  }

  /**
   * Removes the mapping of the specified value key if this map contains a mapping for the key
   */
  public void remove(int key) {
    int bucket = hashCode(key);
    List<Entry> list = array[bucket];
    if (list != null) {
      for (Entry entry : list) {
        if (entry.getKey() == key) {
          list.remove(entry);
          return;
        }
      }
      array[bucket] = list;
    }
  }

  private int hashCode(int key) {
    return key % size;
  }

}
