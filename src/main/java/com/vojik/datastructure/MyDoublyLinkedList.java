package com.vojik.datastructure;

public class MyDoublyLinkedList {

  class Node {

    int val;
    MyDoublyLinkedList.Node next;
    MyDoublyLinkedList.Node prev;

    Node(int val) {
      this.val = val;
    }
  }

  private MyDoublyLinkedList.Node head;
  private int length;

  /**
   * Initialize your data structure here.
   */
  public MyDoublyLinkedList() {
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    if (index >= this.length) {
      return -1;
    }
    MyDoublyLinkedList.Node n = head;
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
    MyDoublyLinkedList.Node newNode = new MyDoublyLinkedList.Node(val);
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
