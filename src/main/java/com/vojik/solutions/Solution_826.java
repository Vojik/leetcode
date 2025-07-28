package com.vojik.solutions;

import java.util.Arrays;

/**
 * 826. Most Profit Assigning Work
 */
public class Solution_826 {

  public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    int len = difficulty.length;
    int[][] priorityWork = new int[len][3];

    for (int i = 0; i < len; i++) {
      priorityWork[i][0] = difficulty[i];
      priorityWork[i][1] = profit[i];
    }
    Arrays.sort(priorityWork, (a, b) -> (a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]));

    int max = 0;
    for (int i = 0; i < len; i++) {
      max = Math.max(max, priorityWork[i][1]);
      priorityWork[i][2] = max;
    }

    int sum = 0;
    for (int w : worker) {
      sum += getMaxProfit(priorityWork, w);
    }
    return sum;
  }

  private int getMaxProfit(int[][] priorityWork, int d) {
    if (d < priorityWork[0][0]) {
      return 0;
    }
    int left = 0;
    int right = priorityWork.length - 1;
    int ans = 0;
    while (left <= right) {
      int mid = (left + right) / 2;
      int diff = priorityWork[mid][0];
      if (d < diff) {
        right = mid - 1;
      } else if (d == diff) {
        ans = Math.max(ans, priorityWork[mid][2]);
        right = mid - 1;
      } else {
        ans = Math.max(ans, priorityWork[mid][2]);
        left = mid + 1;
      }
    }
    return ans;
  }

  public int maxProfitAssignment2(int[] difficulty, int[] profit, int[] worker) {
    int maxAbility = 0;
    for (int w : worker) {
      maxAbility = Math.max(maxAbility, w);
    }

    int[] jobs = new int[maxAbility + 1];

    for (int i = 0; i < difficulty.length; i++) {
      if (difficulty[i] <= maxAbility) {
        jobs[difficulty[i]] = Math.max(jobs[difficulty[i]], profit[i]);
      }
    }

    for (int i = 1; i < jobs.length; i++) {
      jobs[i] = Math.max(jobs[i], jobs[i - 1]);
    }

    int maxProfit = 0;
    for (int w : worker) {
      maxProfit += jobs[w];
    }
    return maxProfit;
  }
}