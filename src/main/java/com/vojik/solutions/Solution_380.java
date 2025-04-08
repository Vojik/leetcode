package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/** 380. Insert Delete GetRandom O(1) */
public class Solution_380 {

  private List<Integer> list;
  private Map<Integer, Integer> map;
  private Random random = new Random();

  public Solution_380() {
    this.list = new ArrayList<>();
    this.map = new HashMap<>();
  }

  public boolean insert(int val) {
    if (map.containsKey(val)) {
      return false;
    }
    map.put(val, list.size());
    list.add(val);
    return true;
  }

  public boolean remove(int val) {
    if (!map.containsKey(val)) {
      return false;
    }

    int lastElement = list.get(list.size() - 1);
    int idx = map.get(val);
    list.set(idx, lastElement);
    list.remove(list.size() - 1);
    map.put(lastElement, idx);
    map.remove(val);
    return true;
  }

  public int getRandom() {
    return list.get(random.nextInt(list.size()));
  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such: RandomizedSet obj = new
 * RandomizedSet(); boolean param_1 = obj.insert(val); boolean param_2 = obj.remove(val); int
 * param_3 = obj.getRandom();
 */
