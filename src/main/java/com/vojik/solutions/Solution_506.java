package com.vojik.solutions;

import java.util.Map;
import java.util.PriorityQueue;

/**
 * 506. Relative Ranks
 */
public class Solution_506 {

  private final Map<Integer, String> rankMap = Map.of(
      1, "Gold Medal",
      2, "Silver Medal",
      3, "Bronze Medal"
  );


  public String[] findRelativeRanks(int[] score) {
    String[] result = new String[score.length];
    PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.score - a.score);
    for (int i = 0; i < score.length; i++) {
      pq.add(new Pair(i, score[i]));
    }

    int rank = 1;
    while (!pq.isEmpty()) {
      Pair pair = pq.poll();
      result[pair.index] = rankMap.getOrDefault(rank, String.valueOf(rank));
      rank++;
    }
    return result;
  }

  class Pair {

    public int index;
    public int score;

    public Pair(int index, int score) {
      this.index = index;
      this.score = score;
    }
  }
}
