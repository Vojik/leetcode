package com.vojik.solutions;

/**
 * 151. Reverse Words in a String
 */
public class Solution_151 {

  public String reverseWords(String s) {
    String[] strs = s.trim().split(" +"); // regex with multiple spaces
    int left = 0;
    int right = strs.length - 1;
    while (left < right) {
      String temp = strs[left];
      strs[left] = strs[right];
      strs[right] = temp;
      left++;
      right--;
    }
    return String.join(" ", strs);
  }
}
