package com.vojik.datastructure;

import com.vojik.helpers.TrieNode;

public class MyTrie {

  private TrieNode root;

  /**
   * Initialize your data structure here.
   */
  public MyTrie() {
    this.root = new TrieNode();
  }

  /**
   * Inserts a word into the trie.
   */
  public void insert(String word) {
    TrieNode curr = this.root;
    for (char c : word.toCharArray()) {
      if (!curr.getChildren().containsKey(c)) {
        curr.getChildren().put(c, new TrieNode());
      }
      curr = curr.getChildren().get(c);
    }
    curr.setIsWord(true);
  }

  /**
   * Returns if the word is in the trie.
   */
  public boolean search(String word) {
    TrieNode curr = this.root;
    for (char c : word.toCharArray()) {
      if (!curr.getChildren().containsKey(c)) {
        return false;
      }
      curr = curr.getChildren().get(c);
    }
    return curr.isWord();
  }

  /**
   * Returns if there is any word in the trie that starts with the given prefix.
   */
  public boolean startsWith(String prefix) {
    TrieNode curr = this.root;
    for (char c : prefix.toCharArray()) {
      if (!curr.getChildren().containsKey(c)) {
        return false;
      }
      curr = curr.getChildren().get(c);
    }
    return true;
  }
}
