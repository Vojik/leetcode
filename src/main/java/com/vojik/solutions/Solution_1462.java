package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** 1462. Course Schedule IV */
public class Solution_1462 {

  public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int i = 0; i < numCourses; i++) {
      graph.put(i, new ArrayList<>());
    }

    for (int[] prereq : prerequisites) {
      int from = prereq[1];
      int to = prereq[0];

      graph.get(from).add(to);
    }

    List<Boolean> ans = new ArrayList<>();
    for (int[] query : queries) {
      Set<Integer> visited = new HashSet<>();
      ans.add(checkIfPrerequisite(graph, visited, query[1], query[0]));
    }
    return ans;
  }

  private boolean checkIfPrerequisite(Map<Integer, List<Integer>> graph, Set<Integer> visited,
      int from, int to) {
    visited.add(from);

    if (from == to) {
      return true;
    }

    boolean ans = false;
    for (int next : graph.get(from)) {
      if (!visited.contains(next)) {
        ans = ans || checkIfPrerequisite(graph, visited, next, to);
      }
    }
    return ans;
  }

  public List<Boolean> checkIfPrerequisite_topologicalSorting(int numCourses, int[][] prerequisites, int[][] queries) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int i = 0; i < numCourses; i++) {
      graph.put(i, new ArrayList<>());
    }

    int[] indegree = new int[numCourses];
    for (int[] prereq : prerequisites) {
      int from = prereq[0];
      int to = prereq[1];

      indegree[to]++;
      graph.get(from).add(to);
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
      if (indegree[i] == 0) {
        queue.add(i);
      }
    }

    Map<Integer, Set<Integer>> nodePrerequisites = new HashMap<>();
    while (!queue.isEmpty()) {
      int node = queue.poll();

      for (int adj : graph.get(node)) {
        if (!nodePrerequisites.containsKey(adj)) {
          nodePrerequisites.put(adj, new HashSet<Integer>());
        }
        nodePrerequisites.get(adj).add(node);

        for (int prereq : nodePrerequisites.getOrDefault(node, new HashSet<>())) {
          nodePrerequisites.get(adj).add(prereq);
        }

        indegree[adj]--;
        if (indegree[adj] == 0) {
          queue.add(adj);
        }
      }
    }

    List<Boolean> answer = new ArrayList<>();
    for (int[] q : queries) {
      answer.add(nodePrerequisites.getOrDefault(q[1], new HashSet<>()).contains(q[0]));
    }
    return answer;
  }
}
