package com.vojik.solutions;

/** 1227. Airplane Seat Assignment Probability */
public class Solution_1227 {

  public double nthPersonGetsNthSeat(int n) {
    return n == 1 ? 1 : 0.5;
  }
}
