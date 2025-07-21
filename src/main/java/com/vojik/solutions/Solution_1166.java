package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1166. Design File System
 */
public class Solution_1166 {

  private Map<String, Integer> map;

  public Solution_1166() {
    this.map = new HashMap<>();
  }

  public boolean createPath(String path, int value) {
    if (path.isEmpty() || path.charAt(0) != '/' || map.containsKey(path)) {
      return false;
    }

    int lastIdx = path.lastIndexOf("/");
    String parent = path.substring(0, lastIdx);

    if (!parent.isEmpty() && !map.containsKey(parent)) {
      return false;
    }

    map.put(path, value);
    return true;
  }

  public int get(String path) {
    if (map.containsKey(path)) {
      return map.get(path);
    }
    return -1;
  }
}
