package com.vojik.solutions;

/** 1668. Maximum Repeating Substring */
public class Solution_1668 {

  public int maxRepeating(String sequence, String word) {
    int res = 0;
    char firstCh = word.charAt(0);
    for (int i = 0; i < sequence.length(); i++) {
      if (sequence.charAt(i) == firstCh) {
        res = Math.max(res, maxRepeating(sequence, i, word));
      }
    }
    return res;
  }

  private int maxRepeating(String str, int i, String word) {
    int wordLen = word.length();
    int j = 0;
    int count = 0;
    while (i < str.length() && str.charAt(i) == word.charAt(j)) {
      i++;
      if (j == wordLen - 1) {
        count++;
      }
      j = (j + 1) % wordLen;
    }
    return count;
  }

  public int maxRepeating2(String sequence, String word) {
    int count = 0;
    StringBuilder sb = new StringBuilder();
    while (true) {
      sb.append(word);
      if (!sequence.contains(sb.toString())) {
        break;
      }
      count++;
    }
    return count;
  }
}
