package com.vojik.solutions;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * #819 https://leetcode.com/problems/most-common-word/
 *
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the
 * list of banned words.  It is guaranteed there is at least one word that isn't banned, and that
 * the answer is unique.
 *
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the
 * paragraph are not case sensitive.  The answer is in lowercase.
 *
 * <pre>
 * Example:
 *
 * Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * </pre>
 *
 * Note:
 *
 * <p>1 <= paragraph.length <= 1000.</p>
 * <p>0 <= banned.length <= 100.</p>
 * <p>1 <= banned[i].length <= 10.</p>
 * <p>The answer is unique, and written in lowercase (even if its occurrences in paragraph may have
 * uppercase symbols, and even if it is a proper noun.)</p>
 * <p>paragraph only consists of letters, spaces, or the punctuation symbols !?',;. </p>
 * <p>There are no hyphens or hyphenated words. Words only consist of letters, never apostrophes or
 * other punctuation symbols.</p>
 */
public class Solution_819 {

  public static String solution1(String paragraph, String[] banned) {

    // 1. Modify original string to delete punctuation symbols
    String newParagraph = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();

    // 2. Create banned set
    Set<String> bannedSet = new HashSet<>();
    Collections.addAll(bannedSet, banned);

    // 3. Fill in the wordCounter as world -> num. of occurrences
    String[] array = newParagraph.split("\\s+");
    Map<String, Integer> wordCounter = new HashMap<>();
    for (String str : array) {
      if (!bannedSet.contains(str)) {
        wordCounter.put(str, wordCounter.getOrDefault(str, 0) + 1);
      }
    }

    // 4. Find most common world
    int maxOccurrence = 0;
    String result = "";
    for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
      if (entry.getValue() > maxOccurrence) {
        result = entry.getKey();
        maxOccurrence = entry.getValue();
      }
    }

    return result;
  }

  public static String solution2(String paragraph, String[] banned) {

    // Bob hit a ball, the hit BALL flew far after it was hit.
    // 1. Create banned set
    Set<String> bannedSet = new HashSet<>();
    Collections.addAll(bannedSet, banned);

    StringBuilder sb = new StringBuilder();
    Map<String, Integer> wordCounter = new HashMap<>();
    String result = "";
    int maxCount = 0;

    char[] chars = paragraph.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (Character.isLetter(c)) {
        // part of word - then continue loop
        sb.append(Character.toLowerCase(c));
        if (i != chars.length - 1) {
          continue;
        }
      }

      // the end of a word

      String word = sb.toString();
      int count = wordCounter.getOrDefault(word, 0);
      if (!bannedSet.contains(word)) {
        wordCounter.put(word, count + 1);
        if (count > maxCount) {
          maxCount = count;
          result = word;
        }
      }

      sb = new StringBuilder();
    }
    return result;
  }
}
