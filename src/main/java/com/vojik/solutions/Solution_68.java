package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 68. Text Justification
 */
public class Solution_68 {

  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> result = new ArrayList<>();
    StringBuilder sb;
    int idx = 0;
    while (idx < words.length) {
      List<String> line = new ArrayList();
      line.add(words[idx]);
      int currentSize = words[idx].length();

      while (idx < words.length - 1 && currentSize + 1 + words[idx + 1].length() <= maxWidth) {
        currentSize += words[idx + 1].length() + 1;
        line.add(words[idx + 1]);
        idx++;
      }
      sb = new StringBuilder();

      boolean isLastLine = idx >= words.length - 1;
      if (isLastLine || line.size() == 1) {
        String lastLine = String.join(" ", line);
        sb.append(lastLine);
        int extraSpaces = maxWidth - lastLine.length();
        for (int i = 0; i < extraSpaces; i++) {
          sb.append(" ");
        }
        result.add(sb.toString());
      } else {
        int spacesInLine = maxWidth - currentSize;
        int gapsNum = line.size() > 1 ? line.size() - 1 : 1;
        int fixedSpaces = spacesInLine / gapsNum;
        int flexibleSpaces = spacesInLine % gapsNum;

        for (String word : line) {
          sb.append(word);
          sb.append(" ");
          for (int i = 0; i < fixedSpaces; i++) {
            sb.append(" ");
          }
          if (flexibleSpaces > 0) {
            sb.append(" ");
            flexibleSpaces--;
          }
        }
        result.add(sb.toString().trim());
      }
      idx++;
    }
    return result;
  }
}
