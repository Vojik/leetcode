package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_705Test {

  @Test
  public void test1_whenSolution1() {
    Solution_705 myHashSet = new Solution_705();
    myHashSet.add(1);      // set = [1]
    myHashSet.add(2);      // set = [1, 2]
    assertTrue(myHashSet.contains(1));
    assertFalse(myHashSet.contains(3));
    myHashSet.add(2);      // set = [1, 2]
    assertTrue(myHashSet.contains(2));
    myHashSet.remove(2);   // set = [1]
    myHashSet.contains(2); // return False, (already removed)
    assertFalse(myHashSet.contains(2));
  }

}