package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 */
public class Solution_118 {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if (numRows < 1) {
      return result;
    }
    result.add(List.of(1));
    if (numRows == 1) {
      return result;
    }
    result.add(List.of(1, 1));

    int numCells = 3;
    for (int i = 2; i < numRows; i++) {
      List<Integer> previousRowList = result.get(i - 1);
      List<Integer> rowList = new ArrayList<>();
      rowList.add(1);
      for (int j = 1; j < numCells - 1; j++) {
        rowList.add(previousRowList.get(j - 1) + previousRowList.get(j));
      }
      rowList.add(1);
      result.add(rowList);
      numCells++;
    }

    return result;
  }

}
