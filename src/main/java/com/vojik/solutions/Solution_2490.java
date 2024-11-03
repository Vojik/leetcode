package com.vojik.solutions;

/**
 * 2490. Circular Sentence
 */
public class Solution_2490 {

  public boolean isCircularSentence(String sentence) {
    int len = sentence.length();
    if (sentence.charAt(0) != sentence.charAt(len - 1)) {
      return false;
    }

    String[] array = sentence.split(" ");
    for (int i = 1; i < array.length; i++) {
      String word = array[i];
      String prevWord = array[i - 1];

      if (word.charAt(0) != prevWord.charAt(prevWord.length() - 1)) {
        return false;
      }
    }
    return true;
  }
}
