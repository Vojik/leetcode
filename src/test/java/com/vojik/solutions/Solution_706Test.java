package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_706Test {

  @Test
  public void test1_whenSolution1() {
    Solution_706 myHashMap = new Solution_706();
    myHashMap.put(1, 1);
    myHashMap.put(2, 2);
    assertEquals(1, myHashMap.get(1));
    assertEquals(-1, myHashMap.get(3));
    myHashMap.put(2, 1);          // update the existing value
    assertEquals(1, myHashMap.get(2));
    myHashMap.remove(2);          // remove the mapping for 2
    assertEquals(-1, myHashMap.get(2));
  }

}