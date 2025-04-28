package com.vojik.solutions;

import java.util.Set;

/**
 * 2559. Count Vowel Strings in Ranges
 */
public class Solution_2559 {

  public int[] vowelStrings(String[] words, int[][] queries) {
    int n = words.length;
    int[] prefixSum = new int[n + 1];
    int i = 1;
    Set<Character> vowel = Set.of('a', 'e', 'i', 'o', 'u');
    for (String word : words) {
      if (vowel.contains(word.charAt(0)) && vowel.contains(word.charAt(word.length() - 1))) {
        prefixSum[i] = prefixSum[i - 1] + 1;
      } else {
        prefixSum[i] = prefixSum[i - 1];
      }
      i++;
    }
    int[] ans = new int[queries.length];
    i = 0;
    for (int[] q : queries) {
      ans[i++] = prefixSum[q[1] + 1] - prefixSum[q[0]];
    }
    return ans;
  }
}
