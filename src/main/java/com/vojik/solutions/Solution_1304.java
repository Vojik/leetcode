package com.vojik.solutions;

/**
 * 1304. Find N Unique Integers Sum up to Zero
 */
public class Solution_1304 {

  public int[] sumZero(int n) {
    int[] ans = new int[n];
    int left = 0;
    int right = n - 1;
    int num = 1;
    while (left < right) {
      ans[left++] = num;
      ans[right--] = -num;
      num++;
    }
    return ans;
  }
}
