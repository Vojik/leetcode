package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 1002. Find Common Characters */
public class Solution_1002 {

  public List<String> commonChars(String[] words) {
    Map<Character, Integer> freqMap = new HashMap<>();
    for (char curChar : words[0].toCharArray()) {
      freqMap.put(curChar, freqMap.getOrDefault(curChar, 0) + 1);
    }
    for (String word : words) {
      Map<Character, Integer> curWordFreqMap = new HashMap<>();
      for (char curChar : word.toCharArray()) {
        Integer count = freqMap.get(curChar);
        if (count != null) {
          curWordFreqMap.put(curChar, curWordFreqMap.getOrDefault(curChar, 0) + 1);
          count--;
          if (count == 0) {
            freqMap.remove(curChar);
          } else {
            freqMap.put(curChar, count);
          }
        }
      }
      freqMap = curWordFreqMap;
    }
    List<String> result = new ArrayList<>();
    for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
      char currentChar = entry.getKey();
      int count = entry.getValue();
      while (count > 0) {
        result.add(String.valueOf(currentChar));
        count--;
      }
    }
    return result;
  }
}
