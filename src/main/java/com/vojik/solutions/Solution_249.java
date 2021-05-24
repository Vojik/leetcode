package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 249. Group Shifted Strings */
public class Solution_249 {

  public List<List<String>> groupStrings(String[] strings) {
    Map<String, List<String>> shifts = new HashMap<>();
    for (String str : strings) {
      String key = getKey(str);
      shifts.computeIfAbsent(key, x -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(shifts.values());
  }

  public String getKey(String s) {
    String key = "";
    for (int i = 1; i < s.length(); i++) {
      int offset = s.charAt(i) - s.charAt(i - 1);
      key += offset < 0 ? offset + 26 : offset;
      key += ",";
    }
    return key;
  }
}
