package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2933. High-Access Employees
 */
public class Solution_2933 {

  public List<String> findHighAccessEmployees(List<List<String>> access_times) {
    List<String> result = new ArrayList<>();
    Map<String, List<Integer>> map = new HashMap<>();
    for (List<String> time : access_times) {
      String empl = time.get(0);
      String timeStr = time.get(1);
      List<Integer> list = map.getOrDefault(empl, new ArrayList<>());
      list.add(toAbsoluteTime(timeStr));
      map.put(empl, list);
    }

    for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
      String empl = entry.getKey();
      if (isHighAccessEmployee(entry.getValue())) {
        result.add(empl);
      }
    }
    return result;
  }

  private int toAbsoluteTime(String str) {
    return Integer.parseInt(str.substring(0, 2)) * 60 + Integer.parseInt(str.substring(2, 4));
  }

  private boolean isHighAccessEmployee(List<Integer> times) {
    if (times.size() < 3) {
      return false;
    }
    Collections.sort(times);
    for (int right = 2; right < times.size(); right++) {
      if (times.get(right) - times.get(right - 2) < 60) {
        return true;
      }
    }
    return false;
  }
}
