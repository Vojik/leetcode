package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 211. Design Add and Search Words Data Structure
 */
public class Solution_211 {

  private TrieNode root;

  /**
   * Initialize your data structure here.
   */
  public Solution_211() {
    this.root = new TrieNode();
  }

  public void addWord(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      TrieNode cur = node.children.getOrDefault(ch, new TrieNode());
      node.children.put(ch, cur);
      node = cur;
    }
    node.isWord = true;
  }

  public boolean search(String word) {
    return searchWithDots(word, 0, root);
  }

  private boolean searchWithDots(String word, int i, TrieNode node) {
    if (i == word.length()) {
      return node.isWord;
    }
    if (word.charAt(i) == '.') {
      for (Map.Entry entry : node.children.entrySet()) {
        if (searchWithDots(word, i + 1, (TrieNode) entry.getValue())) {
          return true;
        }
      }
    } else {
      return node.children.get(word.charAt(i)) != null && searchWithDots(word, i + 1,
          node.children.get(word.charAt(i)));
    }
    return false;
  }

  class TrieNode {

    Map<Character, TrieNode> children;
    boolean isWord;

    public TrieNode() {
      this.children = new HashMap<>();
      this.isWord = false;
    }
  }
}


