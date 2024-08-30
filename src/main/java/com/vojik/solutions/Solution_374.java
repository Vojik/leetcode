package com.vojik.solutions;

/**
 * 374. Guess Number Higher or Lower
 */
public class Solution_374 {

  private final int guessNum;

  public Solution_374(int guessNum) {
    this.guessNum = guessNum;
  }

  public int guessNumber(int n) {
    int lo = 1;
    int hi = Integer.MAX_VALUE;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (guess(mid) < 0) {
        lo = mid + 1;
      } else if (guess(mid) > 0) {
        hi = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  private int guess(int num) {
    return Integer.compare(num, guessNum);
  }
}
