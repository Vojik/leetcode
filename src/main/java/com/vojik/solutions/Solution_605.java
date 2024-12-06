package com.vojik.solutions;

/**
 * 605. Can Place Flowers
 */
public class Solution_605 {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int len = flowerbed.length;
    for (int i = 0; i < len; i++) {
      if (flowerbed[i] == 1) {
        i++;
      } else if (i == len - 1 || flowerbed[i + 1] == 0) {
        n--;
        i++;
      }
    }
    return n <= 0;
  }
}
