package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.vojik.datastructure.PeekingIterator;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_284Test {

  @Test
  public void test1_whenSolution() {
    Iterator<Integer> it = List.of(1, 2, 3).iterator();
    PeekingIterator peekingIterator = new PeekingIterator(it);
    assertEquals(1, peekingIterator.next());
    assertEquals(2, peekingIterator.peek());
    assertEquals(2, peekingIterator.next());
    assertEquals(3, peekingIterator.next());
    assertFalse(peekingIterator.hasNext());
  }
}