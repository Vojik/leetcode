package com.vojik.solutions;

import com.vojik.helpers.NodeWithRandom;
import java.util.HashMap;
import java.util.Map;

public class Solution_138 {

  // 1. Brute force. Time: O(n + n ^2) Space: O(1)
  public NodeWithRandom copyRandomList(NodeWithRandom head) {
    if (head == null) {
      return null;
    }

    // 1. Build deep copy without random
    NodeWithRandom originalHead = head;
    NodeWithRandom newHead = new NodeWithRandom(head.val);
    NodeWithRandom cursor = newHead;
    head = head.next;
    while (head != null) {
      cursor.next = new NodeWithRandom(head.val);
      cursor = cursor.next;
      head = head.next;
    }

    // 2. Find random value for each node
    head = originalHead;
    NodeWithRandom newNode = newHead;
    while (head != null && newNode != null) {
      NodeWithRandom originalRandom = head.random;
      NodeWithRandom originalCursor = originalHead;
      cursor = newHead;
      while (originalCursor != null) {
        if (originalRandom == originalCursor) {
          newNode.random = cursor;
        }
        originalCursor = originalCursor.next;
        cursor = cursor.next;
      }
      head = head.next;
      newNode = newNode.next;
    }

    return newHead;
  }

  // Time: O(2n) Space: O(n)
  public NodeWithRandom copyRandomListWithExtraSpace(NodeWithRandom head) {
    if (head == null) {
      return null;
    }
    Map<NodeWithRandom, NodeWithRandom> map = new HashMap<>();

    NodeWithRandom node = head;
    while (node != null) {
      map.put(node, new NodeWithRandom(node.val));
      node = node.next;
    }

    node = head;
    while (node != null) {
      map.get(node).next = map.get(node.next);
      map.get(node).random = map.get(node.random);
      node = node.next;
    }
    return map.get(head);
  }

  // Time: O(3n) Space: O(1)
  public NodeWithRandom copyRandomListOptimized(NodeWithRandom head) {
    if (head == null) {
      return null;
    }

    // 1. Create copy of each node such as A -> A' -> B -> B' -> C -> C' -> null
    NodeWithRandom node = head;
    NodeWithRandom copy = head;
    while (node != null) {
      NodeWithRandom next = node.next;
      copy = new NodeWithRandom(node.val);
      copy.next = node.next;
      node.next = copy;
      node = next;
    }

    // 2. Set random values for each copy
    node = head;
    while (node != null) {
      if (node.random != null) {
        node.next.random = node.random.next;
      }
      node = node.next.next;
    }

    // 2. Clean up the original list and dedicate a new one
    node = head;
    NodeWithRandom iterNew = new NodeWithRandom(-1);
    copy = iterNew;
    while (node != null) {
      iterNew.next = node.next;
      node.next = node.next.next;

      iterNew = iterNew.next;
      node = node.next;
    }
    return copy.next;
  }

}
