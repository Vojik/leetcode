package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import kotlin.Pair;

/**
 * 373. Find K Pairs with Smallest Sums
 */
public class Solution_373 {

  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    List<List<Integer>> result = new ArrayList<>();
    Set<Pair<Integer, Integer>> visited = new HashSet<>();
    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    minHeap.add(new int[] {nums1[0] + nums2[0], 0, 0});
    visited.add(new Pair(0, 0));

    while (k-- > 0) {
      int[] res = minHeap.poll();
      int i = res[1];
      int j = res[2];
      result.add(List.of(nums1[i], nums2[j]));

      if (res[1] + 1 < nums1.length && !visited.contains(new Pair(i + 1, j))) {
        minHeap.add(new int[] {nums1[i + 1] + nums2[j], i + 1, j});
        visited.add(new Pair(i + 1, j));
      }

      if (res[2] + 1 < nums2.length && !visited.contains(new Pair(i, j + 1))) {
        minHeap.add(new int[] {nums1[i] + nums2[j + 1], i, j + 1});
        visited.add(new Pair(i, j + 1));
      }
    }
    return result;
  }
}
