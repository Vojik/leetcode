package com.vojik.solutions;

/**
 * 1701. Average Waiting Time
 */
public class Solution_1701 {

  public double averageWaitingTime(int[][] customers) {
    double sum = 0;
    int whenAvail = 0;

    for (int i = 0; i < customers.length; i++) {
      whenAvail = Math.max(whenAvail, customers[i][0]) + customers[i][1];
      sum += whenAvail - customers[i][0];
    }

    return sum / customers.length;
  }

}
