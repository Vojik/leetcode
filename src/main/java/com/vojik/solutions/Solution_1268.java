package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1268. Search Suggestions System
 */
public class Solution_1268 {

  public List<List<String>> suggestedProducts(String[] products, String searchWord) {
    Arrays.sort(products);
    Trie trie = new Trie();
    for (String product : products) {
      trie.addWord(product);
    }
    return trie.suggestWords(searchWord);
  }
}

class Trie {

  private Node root;

  public Trie() {
    this.root = new Node();
  }

  public void addWord(String word) {
    Node current = root;
    for (char ch : word.toCharArray()) {
      if (current.children[ch - 'a'] == null) {
        current.children[ch - 'a'] = new Node(ch);
      }
      current.children[ch - 'a'].addToResult(word);
      current = current.children[ch - 'a'];
    }
  }

  public List<List<String>> suggestWords(String searchWord) {
    List<List<String>> result = new ArrayList<>();
    Node current = root;
    for (int i = 0; i < searchWord.length(); i++) {
      char letter = searchWord.charAt(i);
      if (current.children[letter - 'a'] == null) {
        fillGaps(result, i, searchWord.length());
        return result;
      } else {
        current = current.children[letter - 'a'];
        result.add(current.topResults);
      }
    }
    return result;
  }

  private void fillGaps(List<List<String>> result, int from, int to) {
    while (from < to) {
      result.add(Collections.emptyList());
      from++;
    }
  }
}

class Node {

  char letter;
  Node[] children;
  List<String> topResults;

  Node() {
    this.children = new Node[26];
    this.topResults = new ArrayList<String>();
  }

  Node(char letter) {
    this.letter = letter;
    this.children = new Node[26];
    this.topResults = new ArrayList<String>();
  }

  public void addToResult(String word) {
    if (topResults.size() < 3) {
      topResults.add(word);
    }
  }
}
