package com.vojik.solutions;

/**
 * 408. Valid Word Abbreviation
 */
public class Solution_408 {

  public boolean validWordAbbreviation(String word, String abbr) {
    int wordCur = 0;
    int abbrCur = 0;
    while (abbrCur < abbr.length() && wordCur < word.length()) {
      char ch = abbr.charAt(abbrCur);
      if (Character.isDigit(ch)) {
        if (ch == '0') {
          return false;
        }

        int skip = 0;
        while (abbrCur < abbr.length() && Character.isDigit(abbr.charAt(abbrCur))) {
          skip = skip * 10 + abbr.charAt(abbrCur) - '0';
          abbrCur++;
        }
        wordCur += skip;
      } else {
        if (ch != word.charAt(wordCur)) {
          return false;
        }
        wordCur++;
        abbrCur++;
      }
    }
    return abbrCur == abbr.length() && wordCur == word.length();
  }
}
