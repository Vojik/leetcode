package com.vojik.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Apple_2025 {

  public static void main(String[] args) {
    Task b = new TaslImpl("b");
    Task c = new TaslImpl("c");
    Task a = new TaslImpl("a");
    Task d = new TaslImpl("d");

    a.addDeps(b);
    a.addDeps(c);
    d.addDeps(b);
    d.addDeps(c);

    List<Task> tasks = Arrays.asList(a, b, c, d);

    executeAll(tasks);
  }

  public static void executeAll(List<Task> tasks) {
    Map<Task, Integer> indegree = new HashMap<>();
    Map<Task, List<Task>> adj = new HashMap<>();

    // Initialize graph
    for (Task task : tasks) {
      indegree.putIfAbsent(task, 0);
      for (Task dep : task.deps()) {
        adj.computeIfAbsent(dep, k -> new ArrayList<>()).add(task);
        indegree.put(task, indegree.getOrDefault(task, 0) + 1);
      }
    }

    // Start with all tasks having indegree = 0
    Queue<Task> queue = new LinkedList<>();
    for (Task task : indegree.keySet()) {
      if (indegree.get(task) == 0) {
        queue.offer(task);
      }
    }

    int executedCount = 0;

    while (!queue.isEmpty()) {
      Task current = queue.poll();
      current.exec();
      executedCount++;

      // Reduce indegree of dependent tasks
      for (Task next : adj.getOrDefault(current, Collections.emptyList())) {
        indegree.put(next, indegree.get(next) - 1);
        if (indegree.get(next) == 0) {
          queue.offer(next);
        }
      }
    }

    // If not all executed → cycle
    if (executedCount != indegree.size()) {
      throw new IllegalStateException("Cycle detected in tasks");
    }
  }
}

interface Task {

  List<Task> deps();

  void addDeps(Task task);

  void exec();
}

class TaslImpl implements Task {

  private final String message;

  private final List<Task> dependencies;

  TaslImpl(String msg) {
    this.message = msg;
    this.dependencies = new ArrayList<>();
  }

  @Override
  public List<Task> deps() {
    return this.dependencies;
  }

  @Override
  public void addDeps(Task task) {
    this.dependencies.add(task);
  }

  @Override
  public void exec() {
    System.out.println(this.message);
  }
}