package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/** 131. Palindrome Partitioning */
public class Solution_131 {

  public List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
    backtracking(s, 0, new ArrayList<String>(), result);
    return result;
  }

  private void backtracking(String s, int i, List<String> currentList, List<List<String>> result) {
    if (i == s.length()) {
      result.add(new ArrayList<>(currentList));
    } else {
      for (int j = i; j < s.length(); ++j) {
        String candidate = s.substring(i, j + 1);
        if (isPalindrome(candidate)) {
          currentList.add(candidate);
          backtracking(s, j + 1, currentList, result);
          currentList.remove(currentList.size() - 1);
        }
      }
    }
  }

  private boolean isPalindrome(String str) {
    int lo = 0;
    int hi = str.length() - 1;
    while (lo < hi) {
      if (str.charAt(lo) != str.charAt(hi)) {
        return false;
      }
      lo++;
      hi--;
    }
    return true;
  }
}
