package com.vojik.solutions;

import java.util.Set;

/**
 * 824. Goat Latin
 */
public class Solution_824 {

  public String toGoatLatin(String sentence) {
    StringBuilder sb = new StringBuilder();
    String[] words = sentence.split(" ");
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      char firstLetter = word.charAt(0);
      if (vowels.contains(firstLetter)) {
        sb.append(word);
        sb.append("ma");
      } else {
        sb.append(word.substring(1));
        sb.append(firstLetter);
        sb.append("ma");
      }
      int j = i + 1;
      while (j > 0) {
        sb.append("a");
        j--;
      }
      sb.append(" ");
    }
    return sb.toString().trim();
  }
}
