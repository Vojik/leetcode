package com.vojik.solutions;

public class Solution_875 {

  public int minEatingSpeed(int[] piles, int h) {
    int lo = 1;
    int hi = Integer.MIN_VALUE;
    for (int p : piles) {
      hi = Math.max(hi, p);
    }

    int ans = Integer.MAX_VALUE;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (canEat(piles, h, mid)) {
        ans = mid;
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return ans;
  }

  private boolean canEat(int[] piles, int h, int k) {
    for (int i = 0; i < piles.length && h >= 0; i++) {
      int hoursNeeded = piles[i] / k;
      if (piles[i] % k > 0) {
        hoursNeeded++;
      }
      h -= hoursNeeded;
    }
    return h >= 0;
  }
}
