package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 509. Fibonacci Number
 */
public class Solution_509 {

  private static final Map<Integer, Integer> cache = new HashMap<>();

  public int fib(int n) {
    if (n < 2) {
      return n;
    }
    if (cache.containsKey(n)) {
      return cache.get(n);
    }
    int res = fib(n - 1) + fib(n - 2);
    cache.put(n, res);
    return res;
  }
}
