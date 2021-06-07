package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/** 763. Partition Labels */
public class Solution_763 {

  public List<Integer> partitionLabels(String s) {
    List<Integer> result = new ArrayList<>();

    int[] chatToLastIdx = new int[26];
    for (int i = 0; i < s.length(); i++) {
      chatToLastIdx[s.charAt(i) - 'a'] = i;
    }

    int idx = 0;
    while (idx < s.length()) {
      int start = idx;
      int end = idx;
      while (idx <= end) {
        end = Math.max(end, chatToLastIdx[s.charAt(idx) - 'a']);
        idx++;
      }
      result.add(end - start + 1);
    }
    return result;
  }
}
