package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1233. Remove Sub-Folders from the Filesystem
 */
public class Solution_1233 {

  public List<String> removeSubfolders(String[] folder) {
    Trie trie = new Trie();
    for (String f : folder) {
      trie.insert(f);
    }
    List<String> result = new ArrayList<>();
    return trie.getAllParents(trie.root, "", result, "");
  }

  class Trie {

    TrieNode root = new TrieNode();

    public void insert(String folder) {
      String[] subFolders = folder.split("/");
      TrieNode node = root;
      for (String str : subFolders) {
        if (str.isEmpty()) {
          continue;
        }
        if (!node.childs.containsKey(str)) {
          TrieNode newNode = new TrieNode();
          node.childs.put(str, newNode);
        }
        node = node.childs.get(str);
      }
      node.isEnd = true;
    }

    public List<String> getAllParents(TrieNode node, String name, List<String> result,
        String parent) {
      if (node == null) {
        return result;
      }
      String newName = parent.isEmpty() ? "" : parent + "/" + name;
      if (node.isEnd) {
        result.add(parent + "/" + name);
      } else {
        for (Map.Entry<String, TrieNode> e : node.childs.entrySet()) {
          getAllParents(e.getValue(), e.getKey(), result,
              name.isEmpty() ? "" : parent + "/" + name);
        }
      }
      return result;
    }
  }

  class TrieNode {

    boolean isEnd = false;
    Map<String, TrieNode> childs = new HashMap<>();

    TrieNode() {
      this.childs = new HashMap<>();
    }
  }
}
