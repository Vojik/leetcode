package com.vojik.solutions;

import java.util.Arrays;

/**
 * 881. Boats to Save People
 */
public class Solution_881 {

  // Time: O(n log(n)) Space: O(1)
  public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int left = 0;
    int right = people.length - 1;
    int ans = 0;
    while (left <= right) {
      if (people[left] + people[right] <= limit) {
        left++;
      }
      right--;
      ans++;
    }
    return ans;
  }
}
