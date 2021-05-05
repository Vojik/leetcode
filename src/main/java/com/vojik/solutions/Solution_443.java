package com.vojik.solutions;

public class Solution_443 {

  public int compress(char[] chars) {
    int right = 0;
    int ansIdx = 0;

    while (right < chars.length) {
      char curChar = chars[right];
      int count = 0;
      while (right < chars.length && chars[right] == curChar) {
        count++;
        right++;
      }

      chars[ansIdx++] = curChar;
      if (count > 1) {
        for(char c : Integer.toString(count).toCharArray()) {
          chars[ansIdx++] = c;
        }
      }
    }
    return ansIdx;
  }

}
