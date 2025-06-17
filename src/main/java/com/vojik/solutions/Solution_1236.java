package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1236. Web Crawler
 */
public class Solution_1236 {

  public List<String> crawl(String startUrl, HtmlParser htmlParser) {
    String hostName = startUrl.split("/")[2];
    Set<String> visited = new HashSet<>();
    crawl(startUrl, htmlParser, visited, hostName);
    return new ArrayList<>(visited);
  }

  private void crawl(String url, HtmlParser htmlParser, Set<String> visited, String hostName) {
    if (!visited.contains(url) && hostName.equals(url.split("/")[2])) {
      visited.add(url);
      List<String> urls = htmlParser.getUrls(url);
      for (String u : urls) {
        crawl(u, htmlParser, visited, hostName);
      }
    }
  }

  /**
   * This is the HtmlParser's API interface. You should not implement it, or speculate about its
   * implementation
   */
  interface HtmlParser {

    List<String> getUrls(String url);
  }
}


