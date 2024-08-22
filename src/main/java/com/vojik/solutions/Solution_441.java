package com.vojik.solutions;

public class Solution_441 {

  public int arrangeCoins(int n) {
    int ans = 0;
    int coins = 1;
    while (n > 0 && n - coins >= 0) {
      n -= coins;
      coins++;
      ans++;
    }
    return ans;
  }

}
