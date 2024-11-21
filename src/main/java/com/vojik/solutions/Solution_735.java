package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 735. Asteroid Collision
 */
public class Solution_735 {

  // Time: O(n)
  // Space: O(n)
  public int[] asteroidCollision(int[] asteroids) {
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < asteroids.length; i++) {
      int asteroid = asteroids[i];
      if (asteroid > 0 || deque.isEmpty() || deque.getLast() < 0) {
        deque.addLast(asteroid);
      } else if (-asteroid == deque.getLast()) {
        deque.removeLast();
      } else if (-asteroid > deque.getLast()) {
        deque.removeLast();
        i--;
      }
    }
    int[] ans = new int[deque.size()];
    int i = 0;
    while (!deque.isEmpty()) {
      ans[i++] = deque.removeFirst();
    }
    return ans;
  }
}
