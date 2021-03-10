package com.vojik.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 648. Replace Words
 */
public class Solution_648 {

  public String replaceWords(List<String> dictionary, String sentence) {
    TrieNode root = new TrieNode();
    populateTrie(root, dictionary);
    return Arrays.stream(sentence.split(" ")).map(w -> findRoot(root, w))
        .collect(Collectors.joining(" "));

  }

  private void populateTrie(TrieNode mainRoot, List<String> dictionary) {
    for (String word : dictionary) {
      TrieNode root = mainRoot;
      for (int i = 0; i < word.length(); i++) {
        TrieNode node = root.children[word.charAt(i) - 'a'];
        if (node == null) {
          node = new TrieNode();
        }
        if (i == word.length() - 1) {
          node.isRoot = true;

        }
        root.children[word.charAt(i) - 'a'] = node;
        root = node;
      }
    }
  }

  private String findRoot(TrieNode root, String word) {
    for (int i = 0; i < word.length(); i++) {
      TrieNode node = root.children[word.charAt(i) - 'a'];
      if (node == null) {
        return word;
      }
      if (node.isRoot) {
        return word.substring(0, i + 1);
      }
      root = node;
    }
    return word;
  }
}

class TrieNode {

  TrieNode[] children;
  boolean isRoot;

  public TrieNode() {
    this.children = new TrieNode[26];
    this.isRoot = false;
  }
}