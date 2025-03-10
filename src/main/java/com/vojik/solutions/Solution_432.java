package com.vojik.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 432. All O`one Data Structure
 */
public class Solution_432 {

  private Map<String, Node> map = new HashMap<>();
  private Node head;
  private Node tail;

  public Solution_432() {
    this.head = new Node(-1);
    this.tail = new Node(-1);
    this.head.next = tail;
    this.tail.prev = head;
  }

  public void inc(String key) {
    Node currentNode = map.get(key);
    if (currentNode == null) {
      if (head.next.count == -1 || head.next.count > 1) {
        Node node = new Node(1);
        node.values.add(key);
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        map.put(key, node);
      } else {
        head.next.values.add(key);
        map.put(key, head.next);
      }
    } else {
      currentNode.values.remove(key);
      if (currentNode.next.count == -1 || currentNode.next.count != currentNode.count + 1) {
        Node node = new Node(currentNode.count + 1);
        node.values.add(key);
        node.prev = currentNode;
        node.next = currentNode.next;
        currentNode.next.prev = node;
        currentNode.next = node;
        map.put(key, node);
      } else {
        currentNode.next.values.add(key);
        map.put(key, currentNode.next);
      }

      if (currentNode.values.isEmpty()) {
        removeNode(currentNode);
      }
    }
  }

  public void dec(String key) {
    Node node = map.get(key);
    node.values.remove(key);
    if (node.count == 1) {
      map.remove(key);
    } else {
      Node prevNode = node.prev;
      if (prevNode.count == -1 || prevNode.count != node.count - 1) {
        Node newNode = new Node(node.count - 1);
        newNode.values.add(key);
        newNode.prev = prevNode;
        newNode.next = node;
        prevNode.next = newNode;
        node.prev = newNode;
        map.put(key, newNode);
      } else {
        prevNode.values.add(key);
        map.put(key, prevNode);
      }
    }

    if (node.values.isEmpty()) {
      removeNode(node);
    }
  }

  public String getMaxKey() {
    if (tail.prev.count == -1) {
      return "";
    }
    return tail.prev.values.iterator().next();
  }

  public String getMinKey() {
    if (head.next.count == -1) {
      return "";
    }
    return head.next.values.iterator().next();
  }

  private void removeNode(Node node) {
    Node prevNode = node.prev;
    Node nextNode = node.next;

    prevNode.next = nextNode;
    nextNode.prev = prevNode;
  }

  class Node {

    int count;
    Set<String> values;
    Node prev;
    Node next;

    Node(int count) {
      this.count = count;
      this.values = new HashSet<String>();
    }
  }
}
