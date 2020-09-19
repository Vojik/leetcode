package com.vojik.solutions;

/**
 * 88. Merge Sorted Array
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * <p>Note:
 *
 * <p>The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume
 * that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * <p>Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
 *
 * <p>Output: [1,2,2,3,5,6]
 *
 * <p>Constraints:
 *
 * <p>-10^9 <= nums1[i],
 * nums2[i] <= 10^9
 * nums1.length == m + n
 * nums2.length == n
 */
public class Solution_88 {

  // Time: O(n + m) Memory: O(1)
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int right = nums1.length - 1;
    m--;
    n--;

    while (right >= 0) {
      if (m < 0) {
        while (n >= 0) {
          nums1[right] = nums2[n];
          right--;
          n--;
        }
        break;
      }
      if (n < 0) {
        break;
      }

      if (nums1[m] > nums2[n]) {
        nums1[right] = nums1[m];
        m--;
      } else {
        nums1[right] = nums2[n];
        n--;
      }
      right--;
    }
  }
}
