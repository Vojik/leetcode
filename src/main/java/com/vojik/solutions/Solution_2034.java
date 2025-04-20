package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 2034. Stock Price Fluctuation
 */
public class Solution_2034 {

  private final TreeMap<Integer, Integer> priceFreqMap;
  private final Map<Integer, Integer> timeToPrice;
  private int latestTime = 0;

  public Solution_2034() {
    this.priceFreqMap = new TreeMap<>();
    this.timeToPrice = new HashMap<>();
  }

  public void update(int timestamp, int price) {
    latestTime = Math.max(latestTime, timestamp);
    if (timeToPrice.containsKey(timestamp)) {
      int oldPrice = timeToPrice.get(timestamp);

      int newCount = priceFreqMap.get(oldPrice) - 1;
      if (newCount == 0) {
        priceFreqMap.remove(oldPrice);
      } else {
        priceFreqMap.put(oldPrice, newCount);
      }
    }

    timeToPrice.put(timestamp, price);
    priceFreqMap.put(price, priceFreqMap.getOrDefault(price, 0) + 1);
  }

  public int current() {
    return timeToPrice.get(latestTime);
  }

  public int maximum() {
    return priceFreqMap.lastKey();
  }

  public int minimum() {
    return priceFreqMap.firstKey();
  }
}
