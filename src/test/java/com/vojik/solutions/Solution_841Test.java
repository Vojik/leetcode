package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_841Test {

  @Test
  public void tests_whenSolution1() {
    List<List<Integer>> rooms = new ArrayList<>();
    rooms.add(List.of(1));
    rooms.add(List.of(2));
    rooms.add(List.of(3));
    rooms.add(List.of());
    Assertions.assertTrue(new Solution_841().canVisitAllRooms(rooms));
  }

}