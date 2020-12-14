package com.vojik.datastructure;

public class MyCircularQueue {

  private int[] queue;
  private int head = -1;
  private int tail = -1;
  private int size;

  public MyCircularQueue(int k) {
    queue = new int[k];
    size = k;
  }

  public boolean enQueue(int value) {
    if (isFull()) {
      return false;
    }

    if (isEmpty()) {
      head = 0;
      tail = 0;
      queue[head] = value;
      return true;
    }

    tail = (tail + 1) % size;
    queue[tail] = value;
    return true;
  }

  public boolean deQueue() {
    if (isEmpty()) {
      return false;
    }
    if (head == tail) {
      head = -1;
      tail = -1;
    } else {
      head = (head + 1) % size;
    }
    return true;
  }

  public int Front() {
    if (isEmpty()) {
      return head;
    }
    return queue[head];
  }

  public int Rear() {
    if (isEmpty()) {
      return head;
    }
    return queue[tail];
  }

  public boolean isEmpty() {
    return head == -1;
  }

  public boolean isFull() {
    if (head < tail) {
      return tail - head + 1 == size;
    }
    return head - tail == 1;
  }
}
