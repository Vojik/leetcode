package com.vojik.solutions;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 1114. Print in Order
 */
public class Solution_1114 {

  private AtomicBoolean firstExecuted;
  private AtomicBoolean secondExecuted;

  public Solution_1114() {
    this.firstExecuted = new AtomicBoolean(false);
    this.secondExecuted = new AtomicBoolean(false);
  }

  public void first(Runnable printFirst) throws InterruptedException {

    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    firstExecuted.getAndSet(true);
  }

  public void second(Runnable printSecond) throws InterruptedException {
    while(firstExecuted.get() == false) {
    }
    // printSecond.run() outputs "second". Do not change or remove this line.
    printSecond.run();
    secondExecuted.getAndSet(true);
  }

  public void third(Runnable printThird) throws InterruptedException {
    while(secondExecuted.get() == false) {
    }
    // printThird.run() outputs "third". Do not change or remove this line.
    printThird.run();
  }
}
