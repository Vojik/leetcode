package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 981. Time Based Key-Value Store
 */
public class Solution_981 {

  class Pair {

    String value;
    int timestamp;

    Pair(String value, int timestamp) {
      this.value = value;
      this.timestamp = timestamp;
    }
  }

  private Map<String, List<Pair>> map;

  public Solution_981() {
    this.map = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
    if (!map.containsKey(key)) {
      map.put(key, new ArrayList<Pair>());
    }

    map.get(key).add(new Pair(value, timestamp));
  }

  public String get(String key, int timestamp) {
    if (!map.containsKey(key)) {
      return "";
    }
    List<Pair> pairs = map.get(key);
    int lo = 0;
    int hi = pairs.size() - 1;
    String ans = "";
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      Pair p = pairs.get(mid);
      if (p.timestamp == timestamp) {
        return p.value;
      } else if (p.timestamp < timestamp) {
        ans = p.value;
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return ans;
  }
}
