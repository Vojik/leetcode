package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 718. Maximum Length of Repeated Subarray
 */
public class Solution_718 {

  public int findLength(int[] A, int[] B) {
    if (A.length > B.length) {
      return findLength(B, A);
    }

    Map<Integer, List<Integer>> positionMap = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      List<Integer> positions = positionMap.getOrDefault(A[i], new ArrayList<>());
      positions.add(i);
      positionMap.put(A[i], positions);
    }

    int max = 0;
    for (int i = 0; i < B.length; i++) {
      if (positionMap.containsKey(B[i])) {
        List<Integer> positions = positionMap.get(B[i]);
        for (int p : positions) {
          int idx = i;
          int curMax = 1;
          while (++idx < B.length && ++p < A.length && A[p] == B[idx]) {
            curMax++;
          }
          max = Math.max(max, curMax);
        }
      }
    }
    return max;
  }

  public int findLengthDP(int[] A, int[] B) {
    int[][] dp  = new int[A.length + 1][B.length + 1];
    int ans = 0;
    for (int i = A.length - 1; i >= 0 ; --i) {
      for (int j = B.length - 1; j >= 0; --j) {
        if (A[i] == B[j]) {
          dp[i][j] = dp[i + 1][j + 1] + 1;
          ans = Math.max(ans, dp[i][j]);
        }
      }
    }
    return ans;
  }
}
