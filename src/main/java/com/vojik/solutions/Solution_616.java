package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 616. Add Bold Tag in String
 */
public class Solution_616 {

  public String addBoldTag(String s, String[] dict) {
    List<int[]> overlaps = buildOverlappings(s, dict);
    if (overlaps.isEmpty()) {
      return s;
    }
    Collections.sort(overlaps, (a, b) -> a[0] - b[0]);
    overlaps = mergeOverlappings(overlaps);

    StringBuilder result = new StringBuilder(s);
    for (int i = overlaps.size() - 1; i >= 0; i--) {
      result.insert(overlaps.get(i)[1] + 1, "</b>");
      result.insert(overlaps.get(i)[0], "<b>");
    }
    return result.toString();

  }

  private List<int[]> buildOverlappings(String s, String[] dict) {
    List<int[]> overlaps = new ArrayList();
    for (String str : dict) {
      int idx = 0;
      while (s.indexOf(str, idx) > -1) {
        int begin = s.indexOf(str, idx);
        overlaps.add(new int[]{begin, begin + str.length() - 1});
        idx = begin + 1;
      }
    }

    return overlaps;
  }

  private List<int[]> mergeOverlappings(List<int[]> overlaps) {
    int idx = 1;
    int size = overlaps.size();
    for (int i = 1; i < size; i++) {
      int[] value = overlaps.get(i);
      int[] prevValue = overlaps.get(idx - 1);
      if (value[0] <= prevValue[1] + 1) {
        // merge
        overlaps.set(idx - 1, new int[]{prevValue[0], Math.max(value[1], prevValue[1])});
      } else {
        overlaps.set(idx, value);
        idx++;
      }
    }

    return overlaps.subList(0, idx);
  }
}
