package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/** 271. Encode and Decode Strings */
public class Solution_271 {

  private final static String BEGIN = "#BEGIN:";
  private final static String END = ":END#";

  // Encodes a list of strings to a single string.
  public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String s : strs) {
      sb.append(BEGIN);
      sb.append(s);
      sb.append(END);
    }
    return sb.toString();
  }

  // Decodes a single string to a list of strings.
  public List<String> decode(String s) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      int start = s.indexOf(BEGIN, i);
      if (start != -1) {
        int end = s.indexOf(END, start);
        if (end != -1) {
          result.add(s.substring(start + BEGIN.length(), end));
          i = end + END.length() - 1;
        }
      }
    }

    return result;
  }
}
