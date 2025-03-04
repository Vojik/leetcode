package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 2161. Partition Array According to Given Pivot
 */
public class Solution_2161 {

  public int[] pivotArray(int[] nums, int pivot) {
    Deque<Integer> afterPivot = new ArrayDeque<>();
    int sameAsPivot = 0;
    int[] ans = new int[nums.length];
    int p = 0;
    for (int n : nums) {
      if (n == pivot) {
        sameAsPivot++;
      } else if (n < pivot) {
        ans[p++] = n;
      } else {
        afterPivot.addFirst(n);
      }
    }
    while (sameAsPivot > 0) {
      ans[p++] = pivot;
      sameAsPivot--;
    }
    while (!afterPivot.isEmpty()) {
      ans[p++] = afterPivot.removeLast();
    }
    return ans;
  }

}
