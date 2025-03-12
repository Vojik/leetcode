package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/** 381. Insert Delete GetRandom O(1) - Duplicates allowed */
public class Solution_381 {

  private Map<Integer, Set<Integer>> map;
  private List<Integer> list;
  private Random random = new Random();

  public Solution_381() {
    this.map = new HashMap<Integer, Set<Integer>>();
    this.list = new ArrayList<Integer>();
  }

  public boolean insert(int val) {
    if (!map.containsKey(val)) {
      map.put(val, new LinkedHashSet<Integer>());
    }
    map.get(val).add(list.size());
    list.add(val);
    return map.get(val).size() == 1;
  }

  public boolean remove(int val) {
    if (!map.containsKey(val) || map.get(val).isEmpty()) {
      return false;
    }
    Set<Integer> idxs = map.get(val);
    int idxToDelete = idxs.iterator().next();
    idxs.remove(idxToDelete);

    int lastElement = list.get(list.size() - 1);
    list.set(idxToDelete, lastElement);
    map.get(lastElement).add(idxToDelete);
    map.get(lastElement).remove(list.size() - 1);

    list.remove(list.size() - 1);
    return true;
  }

  public int getRandom() {
    int idx = random.nextInt(list.size());
    return list.get(idx);
  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such: RandomizedSet obj = new
 * RandomizedSet(); boolean param_1 = obj.insert(val); boolean param_2 = obj.remove(val); int
 * param_3 = obj.getRandom();
 */
