package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 17. Letter Combinations of a Phone Number */
public class Solution_17 {

  private Map<Character, String> map = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6',
      "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

  // Time: O(4^n * n)
  // Space: O(n)
  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (!digits.isEmpty()) {
      helper(digits, 0, result, new StringBuilder());
    }
    return result;
  }

  private void helper(String digits, int i, List<String> result, StringBuilder current) {
    if (i == digits.length()) {
      result.add(current.toString());
    } else {
      String letters = map.get(digits.charAt(i));
      for (char ch : letters.toCharArray()) {
        current.append(ch);
        helper(digits, i + 1, result, current);
        current.deleteCharAt(current.length() - 1);
      }
    }
  }
}
