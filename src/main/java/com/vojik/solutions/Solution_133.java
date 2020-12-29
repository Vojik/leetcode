package com.vojik.solutions;

import com.vojik.helpers.Node;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * 133. Clone Graph
 *
 * <p>Given a reference of a node in a connected undirected graph.
 *
 * <p>Return a deep copy (clone) of the graph.
 *
 * <p>Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.
 *
 * <p>class Node { public int val; public List<Node> neighbors; }
 *
 * <p>Test case format:
 *
 * <p>For simplicity sake, each node's value is the same as the node's index (1-indexed). For
 * example, the first node with val = 1, the second node with val = 2, and so on. The graph is
 * represented in the test case using an adjacency list.
 *
 * <p>Adjacency list is a collection of unordered lists used to represent a finite graph. Each list
 * describes the set of neighbors of a node in the graph.
 *
 * <p>The given node will always be the first node with val = 1. You must return the copy of the
 * given node as a reference to the cloned graph.
 */
public class Solution_133 {

  private Map<Integer, Node> map = new HashMap<>();

  // Time: O(N) Space: O(N)
  public Node cloneGraph(Node node) {
    return clone(node);
  }

  private Node clone(Node node) {
    if (node == null) {
      return null;
    }
    if (map.containsKey(node.val)) {
      return map.get(node.val);
    }

    Node newNode = new Node(node.val);
    map.put(node.val, newNode);
    for (Node n : node.neighbors) {
      newNode.neighbors.add(clone(n));
    }

    return newNode;

  }

  // Time: O(N) Space: O(N)
  public Node cloneGraph2(Node node) {
    if (node == null) {
      return null;
    }

    Map<Integer, Node> map = new HashMap<>();

    Node firstNewRoot = new Node(node.val);
    map.put(firstNewRoot.val, firstNewRoot);

    Queue<Node> queue = new LinkedList<>();
    queue.add(node);

    while (!queue.isEmpty()) {
      Node oldNode = queue.poll();

      for (Node n : oldNode.neighbors) {
        if (!map.containsKey(n.val)) {
          Node newNode = new Node(n.val);
          map.put(newNode.val, newNode);
          queue.add(n);
        }
        map.get(oldNode.val).neighbors.add(map.get(n.val));
      }
    }

    return firstNewRoot;
  }


  public Node cloneGraph3(Node node) {
    if (node == null) {
      return null;
    }

    Map<Integer, Node> map = new HashMap<>();

    Node firstNewRoot = new Node(node.val);
    map.put(firstNewRoot.val, firstNewRoot);

    Stack<Node> stack = new Stack<>();
    stack.push(node);

    while (!stack.empty()) {
      Node oldNode = stack.pop();

      for (Node n : oldNode.neighbors) {
        if (!map.containsKey(n.val)) {
          Node newNode = new Node(n.val);
          map.put(newNode.val, newNode);
          stack.add(n);
        }
        map.get(oldNode.val).neighbors.add(map.get(n.val));
      }
    }

    return firstNewRoot;
  }
}
