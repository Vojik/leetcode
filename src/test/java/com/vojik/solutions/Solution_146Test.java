package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_146Test {

  @Test
  public void test1_whenSolution1() {
    Solution_146 lRUCache = new Solution_146(2);
    lRUCache.put(1, 1); // cache is {1=1}
    lRUCache.put(2, 2); // cache is {1=1, 2=2}
    Assertions.assertEquals(1, lRUCache.get(1));
    lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
    Assertions.assertEquals(-1, lRUCache.get(2));
    lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
    Assertions.assertEquals(-1, lRUCache.get(1));
    Assertions.assertEquals(3, lRUCache.get(3));
    Assertions.assertEquals(4, lRUCache.get(4));
  }
}