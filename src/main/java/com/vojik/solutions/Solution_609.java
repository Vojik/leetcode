package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 609. Find Duplicate File in System
 */
public class Solution_609 {

  public List<List<String>> findDuplicate(String[] paths) {
    Map<String, List<String>> contentToPath = new HashMap<>();
    for (String path : paths) {
      handlePath(path, contentToPath);
    }
    List<List<String>> ans = new ArrayList<>();
    for (List<String> list : contentToPath.values()) {
      if (list.size() > 1) {
        ans.add(list);
      }
    }
    return ans;
  }

  private void handlePath(String path, Map<String, List<String>> contentToPath) {
    String[] array = path.split(" ");
    String prefix = array[0];
    for (int i = 1; i < array.length; i++) {
      String value = array[i];
      int idx = value.indexOf("(");

      String fileName = value.substring(0, idx);
      String content = value.substring(idx + 1, value.length() - 1);
      contentToPath
          .computeIfAbsent(content, k -> new ArrayList<>())
          .add(prefix + "/" + fileName);
    }
  }
}
