package com.vojik.solutions;

/**
 * 81. Search in Rotated Sorted Array II
 */
public class Solution_81 {

  public boolean search(int[] nums, int target) {
    int minIdx = findIdx(nums);
    System.out.println(minIdx);
    if (nums[minIdx] == target) {
      return true;
    }
    if (target <= nums[nums.length - 1]) {
      return binarySearch(nums, minIdx, nums.length - 1, target);
    } else {
      return binarySearch(nums, 0, minIdx, target);
    }
  }

  private int findIdx(int[] nums) {
    int lo = 0;
    int right = nums.length - 1;
    int hi = right;
    int ans = -1;
    while (lo < hi && nums[lo] == nums[hi]) {
      lo++;
    }
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] <= nums[right]) {
        ans = mid;
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return ans;
  }

  private boolean binarySearch(int[] nums, int lo, int hi, int target) {
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] == target) {
        return true;
      } else if (nums[mid] > target) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return false;
  }
}
