package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_211Test {

  @Test
  public void test1_whenSolution1() {
    Solution_211 wordDictionary = new Solution_211();
    wordDictionary.addWord("bad");
    wordDictionary.addWord("dad");
    wordDictionary.addWord("mad");
    assertFalse(wordDictionary.search("pad"));
    assertTrue(wordDictionary.search("bad"));
    assertTrue(wordDictionary.search(".ad"));
    assertTrue(wordDictionary.search("b.."));
  }

  @Test
  public void test2_whenSolution1() {
    Solution_211 wordDictionary = new Solution_211();
    wordDictionary.addWord("a");
    wordDictionary.addWord("ab");
    assertTrue(wordDictionary.search("a"));
    assertTrue(wordDictionary.search("a."));
    assertTrue(wordDictionary.search("ab"));
    assertFalse(wordDictionary.search(".a"));
    assertTrue(wordDictionary.search(".b"));
    assertFalse(wordDictionary.search("ab."));
    assertTrue(wordDictionary.search("."));
    assertTrue(wordDictionary.search(".."));
  }
}