package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams
 */
public class Solution_49 {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String word : strs) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);
      List<String> innerList = map.getOrDefault(key, new ArrayList<>());
      innerList.add(word);
      map.put(key, innerList);
    }

    return new ArrayList<>(map.values());
  }
}
