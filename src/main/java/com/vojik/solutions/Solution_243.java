package com.vojik.solutions;

/** 243. Shortest Word Distance */
public class Solution_243 {
  public int shortestDistance(String[] wordsDict, String word1, String word2) {
    if (wordsDict.length == 1) {
      return 0;
    }

    int lastWord1Idx = -1;
    int lastWord2Idx = -1;
    int ans = Integer.MAX_VALUE;

    for (int i = 0; i < wordsDict.length; i++) {
      String word = wordsDict[i];
      boolean found = false;
      if (word.equals(word1)) {
        lastWord1Idx = i;
        found = true;
      }
      if (word.equals(word2)) {
        lastWord2Idx = i;
        found = true;
      }
      if (found && lastWord1Idx >= 0 && lastWord2Idx >= 0) {
        ans = Math.min(ans, Math.abs(lastWord1Idx - lastWord2Idx));
      }
    }
    return ans;
  }
}
