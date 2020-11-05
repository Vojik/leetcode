package com.vojik.solutions;

/**
 * 4. Median of Two Sorted Arrays
 *
 * <p>Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of
 * the two sorted arrays.
 *
 * <p>Follow up: The overall run time complexity should be O(log (m+n)).
 *
 * <p>Example 1:
 * <p>Input: nums1 = [1,3], nums2 = [2] Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 *
 * Example 2:
 * * <p>Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 * Example 3:
 * <p>Input: nums1 = [0,0], nums2 = [0,0] Output: 0.00000
 *
 * Example 4:
 * <p>Input: nums1 = [], nums2 = [1] Output: 1.00000
 *
 * Example 5:
 * <p>Input: nums1 = [2], nums2 = [] Output: 2.00000
 *
 * <p>Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i]
 * nums2[i] <= 106
 */
public class Solution_4 {

  // Time: O(log (m+n)) Space: O(1)
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
      return findMedianSortedArrays(nums2, nums1);
    }

    int left = 0;
    int right = nums1.length;

    while (left <= right) {
      int middle1 = right + left / 2;
      // Formula: middle1 + middle2 = (length1 + length2 + 1) / 2
      int middle2 = (nums1.length + nums2.length + 1) / 2 - middle1;

      int firstLeft = middle1 == 0 ? Integer.MIN_VALUE : nums1[middle1 - 1];
      int firstRight = middle1 == nums1.length ? Integer.MAX_VALUE : nums1[middle1];

      int secondLeft = middle2 == 0 ? Integer.MIN_VALUE : nums2[middle2 - 1];
      int secondRight = middle2 == nums2.length ? Integer.MAX_VALUE : nums2[middle2];

      if (firstLeft < secondRight && secondLeft < firstRight) {
        if ((nums1.length + nums2.length) % 2 == 0) {
          return (double) (Math.max(firstLeft, secondLeft)
              + Math.min(firstRight, secondRight)) / 2;
        } else {
          return Math.max(firstLeft, secondLeft);
        }
      } else if (firstLeft < secondRight) {
        // go right in the first array
        left = middle1 + 1;
      } else {
        // go left in the first array
        right = middle1 - 1;
      }

    }
    // all numbers are the same
    return nums1[right];
  }

  // Time: O(n + m) Space: O(n + m)
  public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
    int[] sorted = new int[nums1.length + nums2.length];
    int cur1 = 0;
    int cur2 = 0;
    int i = 0;

    while (cur1 < nums1.length && cur2 < nums2.length) {
      if (nums1[cur1] <= nums2[cur2]) {
        sorted[i] = nums1[cur1];
        cur1++;
      } else {
        sorted[i] = nums2[cur2];
        cur2++;
      }
      i++;
    }

    while (cur1 < nums1.length) {
      sorted[i] = nums1[cur1];
      cur1++;
      i++;
    }

    while (cur2 < nums2.length) {
      sorted[i] = nums2[cur2];
      cur2++;
      i++;
    }

    if (sorted.length % 2 == 0) {
      int first = sorted[sorted.length / 2 - 1];
      int second = sorted[sorted.length / 2];
      return (double) (first + second) / 2;
    } else {
      return sorted[sorted.length / 2];
    }
  }
}
