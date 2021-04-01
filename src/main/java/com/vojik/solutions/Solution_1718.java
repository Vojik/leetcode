package com.vojik.solutions;

/**
 * 1718. Construct the Lexicographically Largest Valid Sequence
 */
public class Solution_1718 {

  public int[] constructDistancedSequence(int n) {
    int[] res = new int[n * 2 - 1];
    boolean[] visited = new boolean[n + 1];
    backtracking(0, n, res, visited);
    return res;
  }

  private boolean backtracking(int index, int n, int[] array, boolean[] visited) {
    if (index == array.length) {
      return true;
    } else if (array[index] != 0) {
      return backtracking(index + 1, n, array, visited);
    } else {

      for (int i = n; i >= 1; i--) {
        if (visited[i]) {
          continue;
        }

        visited[i] = true;
        array[index] = i;

        if (i == 1) {
          if (backtracking(index + 1, n, array, visited)) {
            return true;
          }
        } else if (index + i < array.length && array[index + i] == 0) {
          array[i + index] = i;
          if (backtracking(index + 1, n, array, visited)) {
            return true;
          }
          array[i + index] = 0;
        }
        array[index] = 0;
        visited[i] = false;
      }
    }
    return false;
  }

}
