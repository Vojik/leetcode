package com.vojik.solutions;

import java.util.PriorityQueue;

/**
 * 1366. Rank Teams by Votes
 */
public class Solution_1366 {

  public String rankTeams(String[] votes) {
    int len = votes[0].length();
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
      for (int i = 1; i <= len; i++) {
        if (a[i] != b[i]) {
          return b[i] - a[i];
        }
      }
      return a[0] - b[0];
    });

    int[][] rankArray = new int[26][len + 1];
    for (String v : votes) {
      for (int i = 1; i <= len; i++) {
        int letter = v.charAt(i - 1) - 'A';
        rankArray[letter][i]++;
        rankArray[letter][0] = letter;
      }
    }

    for (int i = 1; i <= len; i++) {
      int letter = votes[0].charAt(i - 1) - 'A';
      pq.add(rankArray[letter]);
    }
    StringBuilder sb = new StringBuilder();
    while (!pq.isEmpty()) {
      sb.append((char) (pq.poll()[0] + 'A'));
    }
    return sb.toString();
  }

}
