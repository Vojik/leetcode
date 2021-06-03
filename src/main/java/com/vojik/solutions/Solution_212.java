package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 212. Word Search II */
public class Solution_212 {

  public List<String> findWords(char[][] board, String[] words) {
    Map<Character, List<String>> firstLetterToWord = new HashMap<>();
    for (String word : words) {
      firstLetterToWord.computeIfAbsent(word.charAt(0), x -> new ArrayList<>()).add(word);
    }
    List<String> result = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        List<String> wordsToCheck = firstLetterToWord.get(board[i][j]);
        if (wordsToCheck != null) {
          for (String wordToCheck : wordsToCheck) {
            boolean[][] visited = new boolean[board.length][board[0].length];
            if (!result.contains(wordToCheck) && search(board, 0, wordToCheck, i, j, visited)) {
              result.add(wordToCheck);
            }
          }
        }
      }
    }
    return result;
  }

  private boolean search(char[][] board, int pos, String word, int i, int j, boolean[][] visited) {
    if (pos == word.length()) {
      return true;
    }
    if (!isOnBoard(board, i, j) || visited[i][j] || word.charAt(pos) != board[i][j]) {
      return false;
    }
    visited[i][j] = true;
    if (search(board, pos + 1, word, i + 1, j, visited)
        || search(board, pos + 1, word, i - 1, j, visited)
        || search(board, pos + 1, word, i, j + 1, visited)
        || search(board, pos + 1, word, i, j - 1, visited)) {
      return true;
    }
    visited[i][j] = false;
    return false;
  }

  private boolean isOnBoard(char[][] board, int i, int j) {
    return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
  }
}
