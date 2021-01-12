package com.vojik.solutions;

/**
 * 779. K-th Symbol in Grammar
 */
public class Solution_779 {

  public int kthGrammar(int N, int K) {
    if (N == 1 || K == 1) {
      return 0;
    }
    if (K == 2) {
      return 1;
    }

    boolean isEven = K % 2 == 0;
    int res = isEven ? kthGrammar(N - 1, K / 2) : kthGrammar(N - 1, (K / 2) + 1);

    if (res == 1) {
      return isEven ? 0 : 1;
    }
    return isEven ? 1 : 0;
  }
}
