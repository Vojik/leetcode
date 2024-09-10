package com.vojik.solutions;

/**
 * 1833. Maximum Ice Cream Bars
 */
public class Solution_1833 {

  public int maxIceCream(int[] costs, int coins) {
    int[] sortedCosts = countingSort(costs);
    int ans = 0;
    for (int cost : sortedCosts) {
      if (coins >= cost) {
        coins -= cost;
        ans++;
      } else {
        break;
      }
    }
    return ans;
  }

  private int[] countingSort(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int e : array) {
      max = Math.max(max, e);
    }

    int[] countArray = new int[max + 1];
    for (int e : array) {
      countArray[e]++;
    }

    int prefixSum = 0;
    for (int i = 0; i < countArray.length; i++) {
      countArray[i] += prefixSum;
      prefixSum = countArray[i];
    }

    int[] sortedArray = new int[array.length];
    for (int i = array.length - 1; i >= 0; i--) {
      sortedArray[countArray[array[i]] - 1] = array[i];
      countArray[array[i]]--;
    }
    return sortedArray;
  }
}
