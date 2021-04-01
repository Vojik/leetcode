package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811. Subdomain Visit Count
 */
public class Solution_811 {

  public List<String> subdomainVisits(String[] cpdomains) {
    Map<String, Integer> counter = new HashMap<>();

    for (String fullDomain : cpdomains) {
      String[] dom = fullDomain.split(" ");
      int defaultCount = Integer.parseInt(dom[0]);
      int idx = 0;
      while (idx < dom[1].length()) {
        int nextIdx = dom[1].indexOf(".", idx);
        String subDom = dom[1].substring(idx, dom[1].length());
        counter.put(subDom, counter.getOrDefault(subDom, 0) + defaultCount);
        idx = nextIdx < 0 ? dom[1].length() + 1 : ++nextIdx;
      }
    }

    List<String> result = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : counter.entrySet()) {
      result.add("" + entry.getValue() + " " + entry.getKey());
    }
    return result;
  }
}
