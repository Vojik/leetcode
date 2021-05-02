package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution_146 {
  private int capacity;
  private Map<Integer, DoublyLinkedNode> cache;
  private DoublyLinkedNode head;
  private DoublyLinkedNode tail;

  public Solution_146(int capacity) {
    this.capacity = capacity;
    this.cache = new HashMap<>();
    this.head = new DoublyLinkedNode();
    this.tail = new DoublyLinkedNode();
    this.head.previous = tail;
    this.tail.next = head;
  }

  public int get(int key) {
    DoublyLinkedNode node = cache.get(key);
    if (node == null) {
      return -1;
    }
    moveToHead(node);
    return node.val;
  }

  public void put(int key, int value) {
    if (cache.containsKey(key)) {
      DoublyLinkedNode node = cache.get(key);
      node.val = value;
      cache.put(key, node);
      moveToHead(node);
    } else {
      DoublyLinkedNode node = new DoublyLinkedNode(key, value);
      addToHead(node);
      cache.put(key, node);

      if (cache.size() > capacity) {
        int keyToRemove = deleteTail();
        cache.remove(keyToRemove);
      }
    }
  }

  private void addToHead(DoublyLinkedNode node) {
    DoublyLinkedNode newSecond = head.previous;
    newSecond.next = node;
    head.previous = node;
    node.next = head;
    node.previous = newSecond;
  }

  private void moveToHead(DoublyLinkedNode node) {
    deleteNode(node);
    addToHead(node);
  }

  private int deleteTail() {
    DoublyLinkedNode toDelete = tail.next;
    if (toDelete != head) {
      tail.next = tail.next.next;
      toDelete.next.previous = tail;
    }
    return toDelete.key;
  }

  private void deleteNode(DoublyLinkedNode node) {
    node.next.previous = node.previous;
    node.previous.next = node.next;
  }

  static class DoublyLinkedNode {
    int key;
    int val;
    DoublyLinkedNode previous;
    DoublyLinkedNode next;

    DoublyLinkedNode() {}
    DoublyLinkedNode(int key, int val) {
      this.val = val;
      this.key = key;
    }
  }
}