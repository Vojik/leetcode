package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_1188 {
  private int capacity;
  private Queue<Integer> queue;
  private Object obj;

  public Solution_1188(int capacity) {
    this.capacity = capacity;
    this.queue = new LinkedList<>();
    this.obj = new Object();
  }

  public void enqueue(int element) throws InterruptedException {
    synchronized (obj) {
      while (size() >= capacity) {
        obj.wait();
      }
      queue.add(element);
      obj.notifyAll();
    }
  }

  public int dequeue() throws InterruptedException {
    int res = 0;
    synchronized (obj) {
      while (size() == 0) {
        obj.wait();
      }
      res = queue.poll();
      obj.notifyAll();
    }
    return res;
  }

  public int size() {
    return queue.size();
  }
}
