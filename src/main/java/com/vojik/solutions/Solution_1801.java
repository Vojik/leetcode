package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 1833. Maximum Ice Cream Bars
 */
public class Solution_1801 {

  //{1, 29, 1}, {22, 7, 1}, {24, 1, 0}, {25, 15, 1}, {18, 8, 1}, {8, 22, 0},
  //            {25, 15, 1}, {30, 1, 1}, {27, 30, 0

  // buy: 22 - 6
  // sell: 1 - 29

  private PriorityQueue<Pair> buyPq = new PriorityQueue<>((a, b) -> b.price - a.price);
  private PriorityQueue<Pair> sellPq = new PriorityQueue<>((a, b) -> a.price - b.price);

  public int getNumberOfBacklogOrders(int[][] orders) {
    for (int[] order : orders) {
      int orderType = order[2];
      if (orderType == 0) {
        handleBuy(order);
      } else {
        handleSell(order);
      }
    }

    int result = 0, mod = 1000000007;
    while (!buyPq.isEmpty()) {
      result = (result + buyPq.poll().amount) % mod;
    }
    while (!sellPq.isEmpty()) {
      result = (result + sellPq.poll().amount) % mod;
    }

    return result;
  }

  private void handleBuy(int[] order) {
    int buyPrice = order[0];
    int buyAmount = order[1];
    while (buyAmount > 0 && !sellPq.isEmpty() && sellPq.peek().price <= buyPrice) {
      Pair sellOrder = sellPq.poll();
      if (sellOrder.amount >= buyAmount) {
        int newAmount = sellOrder.amount - buyAmount;
        if (newAmount > 0) {
          sellPq.add(new Pair(sellOrder.price, newAmount));
        }
        return;
      } else {
        buyAmount -= sellOrder.amount;
      }
    }
    if (buyAmount > 0) {
      buyPq.add(new Pair(order[0], buyAmount));
    }
  }

  private void handleSell(int[] order) {
    int sellPrice = order[0];
    int sellAmount = order[1];

    while (sellAmount > 0 && !buyPq.isEmpty() && buyPq.peek().price >= sellPrice) {
      Pair buyOrder = buyPq.poll();
      if (buyOrder.amount >= sellAmount) {
        int newAmount = buyOrder.amount - sellAmount;
        if (newAmount > 0) {
          buyPq.add(new Pair(buyOrder.price, newAmount));
        }
        return;
      } else {
        sellAmount -= buyOrder.amount;
      }
    }

    if (sellAmount > 0) {
      sellPq.add(new Pair(order[0], sellAmount));
    }
  }

  static class Pair {

    int price;
    int amount;

    Pair(int price, int amount) {
      this.price = price;
      this.amount = amount;
    }
  }
}


