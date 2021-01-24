package com.vojik.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 912. Sort an Array
 */
public class Solution_912 {

  // top-down Merge sort
  // Time: O(n*log(n)) Space: O(n)
  public int[] sortArray(int[] nums) {
    if (nums.length <= 1) {
      return nums;
    }
    int pivot = nums.length / 2;
    int[] left = sortArray(Arrays.copyOfRange(nums, 0, pivot));
    int[] right = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
    return mergeSort(left, right);
  }

  // bottom up iterative approach of Merge sort
  // Time: O(n*log(n)) Space: O(n)
  public int[] sortArrayIteratively(int[] nums) {
    if (nums.length <= 1) {
      return nums;
    }
    Queue<int[]> queue = new LinkedList<>();
    for (int n : nums) {
      queue.offer(new int[]{n});
    }
    while (queue.size() > 1) {
      queue.offer(mergeSort(queue.poll(), queue.poll()));
    }
    return queue.poll();
  }

  private int[] mergeSort(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int cursorLeft = 0, cursorRight = 0, cursorRes = 0;

    while (cursorLeft < left.length && cursorRight < right.length) {
      if (left[cursorLeft] < right[cursorRight]) {
        result[cursorRes++] = left[cursorLeft++];
      } else {
        result[cursorRes++] = right[cursorRight++];
      }
    }

    while (cursorLeft < left.length) {
      result[cursorRes++] = left[cursorLeft++];
    }

    while (cursorRight < right.length) {
      result[cursorRes++] = right[cursorRight++];
    }

    return result;
  }

  // Quick sort
  // Time: O(N log(N))
  public void quickSort(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
  }

  private void quickSort(int[] nums, int start, int end) {
    if (start < end) {
      int pivotIdx = partition(nums, start, end);
      quickSort(nums, start, pivotIdx - 1);
      quickSort(nums, pivotIdx + 1, end);
    }
  }

  private int partition(int[] nums, int start, int end) {
    int pivot = nums[end];
    int i = start;
    for (int j = i; j < end; j++) {
      if (nums[j] < pivot) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
    }

    int temp = nums[i];
    nums[i] = nums[end];
    nums[end] = temp;
    return i;
  }
}
