package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1396. Design Underground System
 */
public class Solution_1396 {

  private Map<Integer, Integer> checkInMap;
  private Map<Integer, String> checkInStationMap;
  private Map<String, int[]> checkOutMap;

  public Solution_1396() {
    checkInMap = new HashMap<>();
    checkInStationMap = new HashMap<>();
    checkOutMap = new HashMap<>();
  }

  public void checkIn(int id, String stationName, int t) {
    checkInMap.put(id, t);
    checkInStationMap.put(id, stationName.toLowerCase());
  }

  public void checkOut(int id, String stationName, int t) {
    final String fromStation = checkInStationMap.remove(id);
    final String key = getStationKey(fromStation, stationName);

    int[] times = checkOutMap.getOrDefault(key, new int[2]);
    times[0] += t - checkInMap.remove(id);
    times[1]++;
    checkOutMap.put(key, times);
  }

  public double getAverageTime(String startStation, String endStation) {
    String key = getStationKey(startStation, endStation);
    int[] times = checkOutMap.get(key);
    return (double) times[0] / times[1];
  }

  private String getStationKey(String from, String to) {
    return from.toLowerCase() + "_" + to.toLowerCase();
  }
}
