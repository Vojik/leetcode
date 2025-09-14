package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_1462Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals(List.of(false, true),
        new Solution_1462().checkIfPrerequisite(2, new int[][] {{1, 0}},
            new int[][] {{0, 1}, {1, 0}}));

    assertEquals(List.of(false, false),
        new Solution_1462().checkIfPrerequisite(2, new int[][] {},
            new int[][] {{1, 0}, {0, 1}}));

    assertEquals(List.of(true, true),
        new Solution_1462().checkIfPrerequisite(3, new int[][] {{1, 2}, {1, 0}, {2, 0}},
            new int[][] {{1, 0}, {1, 2}}));
  }

  @Test
  public void tests_whenSolution2() {
    assertEquals(List.of(false, true),
        new Solution_1462().checkIfPrerequisite_topologicalSorting(2, new int[][] {{1, 0}},
            new int[][] {{0, 1}, {1, 0}}));

    assertEquals(List.of(false, false),
        new Solution_1462().checkIfPrerequisite_topologicalSorting(2, new int[][] {},
            new int[][] {{1, 0}, {0, 1}}));

    assertEquals(List.of(true, true),
        new Solution_1462().checkIfPrerequisite_topologicalSorting(3,
            new int[][] {{1, 2}, {1, 0}, {2, 0}},
            new int[][] {{1, 0}, {1, 2}}));
  }

}