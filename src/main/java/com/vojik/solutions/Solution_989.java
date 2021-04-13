package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989. Add to Array-Form of Integer
 */
public class Solution_989 {

  public List<Integer> addToArrayForm(int[] num, int k) {
    List<Integer> result = new ArrayList<>();
    int j = num.length - 1;

    while (j >= 0 || k > 0) {
      if (j >= 0) {
        k = num[j] + k;
      }
      result.add(k % 10);
      k = k / 10;
      j--;
    }
    Collections.reverse(result);
    return result;
  }
}
