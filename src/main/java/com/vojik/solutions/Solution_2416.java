package com.vojik.solutions;

/**
 * 2416. Sum of Prefix Scores of Strings
 */
public class Solution_2416 {

  public int[] sumPrefixScores(String[] words) {

    Trie trie = new Trie();

    for (String word : words) {
      trie.insert(word);
    }

    int[] result = new int[words.length];
    for (int i = 0; i < words.length; i++) {
      result[i] = trie.getScore(words[i]);
    }
    return result;
  }

  static class TrieNode {

    TrieNode[] children = new TrieNode[26];
    int counter = 0;
  }

  static class Trie {

    TrieNode root = new TrieNode();

    public void insert(String word) {
      TrieNode node = root;
      for (char ch : word.toCharArray()) {
        int idx = ch - 'a';
        if (node.children[idx] == null) {
          node.children[idx] = new TrieNode();
        }
        node.children[idx].counter++;
        node = node.children[idx];
      }
    }

    public int getScore(String word) {
      TrieNode node = root;
      int score = 0;
      for (char ch : word.toCharArray()) {
        int idx = ch - 'a';
        score += node.children[idx].counter;
        node = node.children[idx];
      }
      return score;
    }
  }
}
