package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/** 380. Insert Delete GetRandom O(1) */
public class Solution_380 {
  private final List<Integer> list;
  private final Set<Integer> set;
  private final Random random;

  /** Initialize your data structure here. */
  public Solution_380() {
    this.list = new ArrayList<>();
    this.set = new HashSet<>();
    this.random = new Random();
  }

  /**
   * Inserts a value to the set. Returns true if the set did not already contain the specified
   * element.
   */
  public boolean insert(int val) {
    boolean wasAdded = set.add(val);
    if (wasAdded) {
      list.add(val);
    }
    return wasAdded;
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    boolean wasRemoved = set.remove(val);
    if (wasRemoved) {
      list.remove(Integer.valueOf(val));
    }
    return wasRemoved;
  }

  /** Get a random element from the set. */
  public int getRandom() {
    return list.get(random.nextInt(list.size()));
  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such: RandomizedSet obj = new
 * RandomizedSet(); boolean param_1 = obj.insert(val); boolean param_2 = obj.remove(val); int
 * param_3 = obj.getRandom();
 */
