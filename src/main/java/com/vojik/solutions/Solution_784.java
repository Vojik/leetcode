package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. Letter Case Permutation
 */
public class Solution_784 {

  public List<String> letterCasePermutation(String S) {
    List<String> result = new ArrayList<>();
    letterCasePermutation(S.toLowerCase().toCharArray(), result, 0);
    return new ArrayList<>(result);
  }

  private void letterCasePermutation(char[] chars, List<String> result, int start) {
    if (start == chars.length) {
      result.add(new String(chars));
      return;
    }
    if (chars[start] >= '0' && chars[start] <= '9') {
      letterCasePermutation(chars, result, start + 1);
      return;
    }

    chars[start] = Character.toUpperCase(chars[start]);
    letterCasePermutation(chars, result, start + 1);
    chars[start] = Character.toLowerCase(chars[start]);
    letterCasePermutation(chars, result, start + 1);

  }
}
