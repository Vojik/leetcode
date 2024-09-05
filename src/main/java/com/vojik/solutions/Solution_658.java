package com.vojik.solutions;

import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;

/**
 * 658. Find K Closest Elements
 *
 * <p>Given a sorted array arr, two integers k and x, find the k closest elements to x in the
 * array. The result should also be sorted in ascending order. If there is a tie, the smaller
 * elements are always preferred.
 * <p>
 * Example 1: <p>Input: arr = [1,2,3,4,5], k = 4, x = 3 Output: [1,2,3,4]
 * <p>
 * Example 2: <p>Input: arr = [1,2,3,4,5], k = 4, x = -1 Output: [1,2,3,4]
 *
 * <p>Constraints:
 * <p>1 <= k <= arr.length 1 <= arr.length <= 10^4 Absolute value of elements in the array and x
 * will not exceed 104
 */
public class Solution_658 {

  public List<Integer> findClosestElements(int[] arr, int k, int x) {
    List<Integer> result = new ArrayList();
    if (arr.length == 1) {
      result.add(arr[0]);
      return result;
    }

    // if x < first element then return first k elements
    if (arr[0] > x) {
      for (int i = 0; i < k; i++) {
        result.add(arr[i]);
      }
      return result;
    }

    // if x > last element then return last k elements
    if (arr[arr.length - 1] < x) {
      for (int i = arr.length - 1 - k; i < arr.length - 1; i++) {
        result.add(arr[i]);
      }
      return result;
    }

    int left = 0;
    int right = arr.length - 1;

    while (left + 1 < right) {
      int middle = left + (right - left) / 2;
      if (arr[middle] == x) {
        left = middle;
      } else if (arr[middle] > x) {
        right = middle;
      } else {
        left = middle;
      }
    }

    // post-processing
    int length = k;
    while (length > 0) {
      if (left >= 0 && right < arr.length && abs(arr[left] - x) <= abs(arr[right] - x)) {
        left--;
      } else if (left >= 0 && right == arr.length) {
        left--;
      } else {
        right++;
      }
      length--;
    }

    while (k > 0) {
      result.add(arr[++left]);
      k--;
    }
    return result;
  }

  public List<Integer> findClosestElements2(int[] arr, int k, int x) {
    int idx = binarySearch(arr, x);
    List<Integer> result = new ArrayList<>();
    int left = idx - 1;
    int right = idx;
    int len = k;

    while (len > 0) {
      if (left < 0) {
        right++;
      } else if (right > arr.length - 1) {
        left--;
      } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
        left--;
      } else {
        right++;
      }
      len--;
    }

    while (k > 0) {
      result.add(arr[++left]);
      k--;
    }
    return result;
  }

  private int binarySearch(int[] arr, int target) {
    int lo = 0;
    int hi = arr.length - 1;
    if (target > arr[hi]) {
      return hi;
    }
    if (target < arr[lo]) {
      return lo;
    }

    int ans = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        lo = mid + 1;
      } else {
        ans = mid;
        hi = mid - 1;
      }
    }
    return ans;
  }
}
