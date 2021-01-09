package com.vojik.solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 841. Keys and Rooms
 */
public class Solution_841 {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int counter = 0;
    boolean[] visited = new boolean[rooms.size()];
    Queue<Integer> q = new LinkedList<>();
    q.add(0);

    while (!q.isEmpty()) {
      int room = q.poll();
      if (!visited[room]) {
        q.addAll(rooms.get(room));
        visited[room] = true;
        counter++;
      }
    }
    return rooms.size() == counter;
  }
}