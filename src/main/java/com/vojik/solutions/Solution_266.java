package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

public class Solution_266 {

  public boolean canPermutePalindrome(String s) {
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (set.contains(ch)) {
        set.remove(ch);
      } else {
        set.add(ch);
      }
    }
    return set.size() <= 1;
  }

}
