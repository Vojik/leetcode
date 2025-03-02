package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 2570. Merge Two 2D Arrays by Summing Values
 */
public class Solution_2570 {

  // Time: O(len1 + len2) Space: O(len1 + len2)
  public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
    int len1 = nums1.length;
    int len2 = nums2.length;
    List<int[]> ans = new ArrayList<>();
    int p1 = 0, p2 = 0;
    while (p1 < len1 && p2 < len2) {
      if (nums1[p1][0] == nums2[p2][0]) {
        ans.add(new int[] {nums1[p1][0], nums1[p1++][1] + nums2[p2++][1]});
      } else if (nums1[p1][0] < nums2[p2][0]) {
        ans.add(nums1[p1++]);
      } else {
        ans.add(nums2[p2++]);
      }
    }
    while (p1 < len1) {
      ans.add(nums1[p1++]);
    }
    while (p2 < len2) {
      ans.add(nums2[p2++]);
    }
    return ans.toArray(new int[ans.size()][]);
  }
}
