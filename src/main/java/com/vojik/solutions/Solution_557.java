package com.vojik.solutions;

/**
 * 557. Reverse Words in a String III
 */
public class Solution_557 {

  public String reverseWords(String s) {
    if (s == null || s.isBlank()) {
      return "";
    }

    StringBuilder result = new StringBuilder();
    String[] words = s.split(" ");
    for (String word : words) {
      result.append(" ").append(new StringBuilder(word).reverse().toString());
    }
    return result.toString().trim();
  }
}
