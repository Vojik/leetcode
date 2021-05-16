package com.vojik.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/** 690. Employee Importance */
public class Solution_690 {
  public int getImportance(List<Employee> employees, int id) {
    Map<Integer, Employee> map = new HashMap<>();
    for (Employee e : employees) {
      map.put(e.id, e);
    }
    return dfs(map, id);
  }

  private int dfs(Map<Integer, Employee> map, int targetId) {
    Employee empl = map.get(targetId);
    int total = empl.importance;
    for (int subId : empl.subordinates) {
      total += dfs(map, subId);
    }
    return total;
  }

  public int getImportance2(List<Employee> employees, int id) {
    Map<Integer, Employee> map = new HashMap<>();
    for (Employee e : employees) {
      map.put(e.id, e);
    }
    Queue<Integer> queue = new LinkedList<>();
    Employee empl = map.get(id);
    int result = empl.importance;
    queue.addAll(empl.subordinates);
    while (!queue.isEmpty()) {
      empl = map.get(queue.poll());
      result += empl.importance;
      for (Integer subId : empl.subordinates) {
        queue.add(subId);
      }
    }

    return result;
  }

  static class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
  }
}
