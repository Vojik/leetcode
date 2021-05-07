package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/** 359. Logger Rate Limiter */
public class Solution_359 {

  private Map<String, Integer> lastOccurrenceMap;

  /** Initialize your data structure here. */
  public Solution_359() {
    this.lastOccurrenceMap = new HashMap<>();
  }

  /**
   * Returns true if the message should be printed in the given timestamp, otherwise returns false.
   * If this method returns false, the message will not be printed. The timestamp is in seconds
   * granularity.
   */
  public boolean shouldPrintMessage(int timestamp, String message) {
    Integer lastTime = lastOccurrenceMap.get(message);
    if (lastTime == null || timestamp - lastTime >= 10) {
      lastOccurrenceMap.put(message, timestamp);
      return true;
    }
    return false;
  }
}
