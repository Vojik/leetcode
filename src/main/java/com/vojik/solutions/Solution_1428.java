package com.vojik.solutions;

import java.util.List;

/** 1428. Leftmost Column with at Least a One */
public class Solution_1428 {

  public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
    List<Integer> dimensions = binaryMatrix.dimensions();
    int rows = dimensions.get(0);
    int cols = dimensions.get(1);
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < rows; i++) {
      int left = 0;
      int right = cols - 1;
      while (left < right) {
        int mid = left + (right - left) / 2;
        if (binaryMatrix.get(i, mid) == 0) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
      if (binaryMatrix.get(i, left) == 1) {
        ans = Math.min(left, ans);
      }
    }
    return ans == Integer.MAX_VALUE ? -1 : ans;
  }

  interface BinaryMatrix {
    int get(int row, int col);

    List<Integer> dimensions();
  }
}
