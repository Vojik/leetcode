package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_707Test {

  @Test
  public void test1_whenSolution1() {
    Solution_707 myLinkedList = new Solution_707();
    myLinkedList.addAtHead(1);
    myLinkedList.addAtTail(3);
    myLinkedList.addAtIndex(1, 2);
    int firstEl = myLinkedList.get(1);
    assertEquals(2, firstEl);
    myLinkedList.deleteAtIndex(1);
    firstEl = myLinkedList.get(1);
    assertEquals(3, firstEl);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_707 myLinkedList = new Solution_707();
    myLinkedList.addAtHead(7);
    myLinkedList.addAtHead(2);
    myLinkedList.addAtHead(1);
    myLinkedList.addAtIndex(3, 0);
    myLinkedList.deleteAtIndex(2);
    myLinkedList.addAtHead(6);
    myLinkedList.addAtTail(4);
    int firstEl = myLinkedList.get(4);
    assertEquals(4, firstEl);
    myLinkedList.addAtHead(4);
    firstEl = myLinkedList.get(4);
    assertEquals(0, firstEl);
    myLinkedList.addAtIndex(5, 0);
    firstEl = myLinkedList.get(5);
    assertEquals(0, firstEl);
    myLinkedList.addAtHead(6);
    firstEl = myLinkedList.get(0);
    assertEquals(6, firstEl);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_707 myLinkedList = new Solution_707();
    myLinkedList.addAtIndex(0, 10);
    myLinkedList.addAtIndex(0, 20);
    myLinkedList.addAtIndex(1, 30);
    int el = myLinkedList.get(0);
    assertEquals(20, el);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_707 myLinkedList = new Solution_707();
    myLinkedList.addAtIndex(0, 10);
    myLinkedList.addAtIndex(0, 20);
    myLinkedList.addAtIndex(1, 30);
    int el = myLinkedList.get(0);
    assertEquals(20, el);
    el = myLinkedList.get(1);
    assertEquals(30, el);
    el = myLinkedList.get(2);
    assertEquals(10, el);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_707 myLinkedList = new Solution_707();
    myLinkedList.addAtTail(1);
    assertEquals(1, myLinkedList.get(0));
  }

  @Test
  public void test6_whenSolution1() {
    Solution_707 myLinkedList = new Solution_707();
    myLinkedList.addAtHead(2);
    myLinkedList.deleteAtIndex(1);
    myLinkedList.addAtHead(2);
    myLinkedList.addAtHead(7);
    myLinkedList.addAtHead(3);
    myLinkedList.addAtHead(2);
    myLinkedList.addAtHead(5);
    myLinkedList.addAtTail(5);
    assertEquals(2, myLinkedList.get(5));
    myLinkedList.deleteAtIndex(6);
    assertEquals(2, myLinkedList.get(4));
    myLinkedList.deleteAtIndex(4);
    assertEquals(2, myLinkedList.get(4));
  }

  @Test
  public void test7_whenSolution1() {
    Solution_707 myLinkedList = new Solution_707();
    myLinkedList.addAtHead(4);
    assertEquals(-1, myLinkedList.get(1));
    myLinkedList.addAtHead(1);
    myLinkedList.addAtHead(5);
    myLinkedList.deleteAtIndex(3);
    myLinkedList.addAtHead(7);
    assertEquals(4, myLinkedList.get(3));
    myLinkedList.addAtHead(1);
    assertEquals(7, myLinkedList.get(1));
    myLinkedList.deleteAtIndex(4);
    assertEquals(1, myLinkedList.get(3));
  }
}
