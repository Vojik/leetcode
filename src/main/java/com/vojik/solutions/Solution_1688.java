package com.vojik.solutions;

/**
 * 1688. Count of Matches in Tournament
 */
public class Solution_1688 {

  // Time: O(1) Space: O(1)
  public int numberOfMatchesFunny(int n) {
    return n - 1;
  }

  public int numberOfMatchesBacktracking(int n) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }
    return n % 2 == 0
        ? n / 2 + numberOfMatchesBacktracking(n / 2)
        : (n - 1) / 2 + numberOfMatchesBacktracking(((n - 1) / 2) + 1);
  }
}
