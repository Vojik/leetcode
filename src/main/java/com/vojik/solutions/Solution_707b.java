package com.vojik.solutions;

/**
 * 707. Design Linked List * *
 *
 * <p>Design your implementation of the linked list. You can choose to use a singly or doubly *
 * linked list. A node in a singly linked list should have two attributes: val and next. val is the
 * * value of the current node, and next is a pointer/reference to the next node. If you want to use
 * * the doubly linked list, you will need one more attribute prev to indicate the previous node in
 * * the linked list. Assume all nodes in the linked list are 0-indexed. * *
 *
 * <p>Implement the MyLinkedList class: * *
 *
 * <p>MyLinkedList() Initializes the MyLinkedList object. int get(int index) Get the value of the *
 * index(th) node in the linked list. If the index is invalid, return -1. void addAtHead(int val) *
 * Add a node of value val before the first element of the linked list. After the insertion, the new
 * * node will be the first node of the linked list. void addAtTail(int val) Append a node of value
 * * val as the last element of the linked list. void addAtIndex(int index, int val) Add a node of *
 * value val before the indexth node in the linked list. If index equals the length of the linked *
 * list, the node will be appended to the end of the linked list. If index is greater than the *
 * length, the node will not be inserted. void deleteAtIndex(int index) Delete the indexth node in *
 * the linked list, if the index is valid.
 */
public class Solution_707b {

  class Node {

    int val;
    Node next;
    Node prev;

    Node(int val) {
      this.val = val;
    }
  }

  private Node head;
  private int length;

  /**
   * Initialize your data structure here.
   */
  public Solution_707b() {
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    if (index >= this.length) {
      return -1;
    }
    Node n = head;
    for (int i = 1; i <= index; i++) {
      n = n.next;
    }
    return n.val;
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the
   * new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;
    length++;
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val) {
    if (this.length == 0) {
      addAtHead(val);
      return;
    }
    Node n = head;
    for (int i = 1; i < length; i++) {
      n = n.next;
    }
    Node newNode = new Node(val);
    newNode.prev = n;
    n.next = newNode;
    length++;
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the
   * length of linked list, the node will be appended to the end of linked list. If index is greater
   * than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {
    if (index == 0) {
      addAtHead(val);
      return;
    } else if (index == this.length) {
      addAtTail(val);
      return;
    } else if (index > this.length) {
      return;
    }

    Node n = head;
    for (int i = 1; i < index; i++) {
      n = n.next;
    }
    Node newNode = new Node(val);
    newNode.next = n.next;
    newNode.prev = n;
    n.next.prev = newNode;
    n.next = newNode;
    length++;
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {
    if (index >= this.length) {
      return;
    } else if (index == 0) {
      head = head.next;
      length--;
      return;
    } else if (index == length - 1) {
      length--;
      return;
    }

    Node n = head;
    for (int i = 1; i < index; i++) {
      n = n.next;
    }
    n.next.prev = n;
    n.next = n.next.next;
    length--;
  }

}
