package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_1396Test {


  @Test
  public void test1_whenSolution1() {
    Solution_1396 undergroundSystem = new Solution_1396();
    undergroundSystem.checkIn(45, "Leyton", 3);
    undergroundSystem.checkIn(32, "Paradise", 8);
    undergroundSystem.checkIn(27, "Leyton", 10);
    undergroundSystem.checkOut(45, "Waterloo", 15);
    undergroundSystem.checkOut(27, "Waterloo", 20);
    undergroundSystem.checkOut(32, "Cambridge", 22);
    assertEquals(14.00000, undergroundSystem.getAverageTime("Paradise", "Cambridge"));
    assertEquals(11.00000, undergroundSystem.getAverageTime("Leyton",
        "Waterloo"));          // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
    undergroundSystem.checkIn(10, "Leyton", 24);
    assertEquals(11.00000, undergroundSystem.getAverageTime("Leyton", "Waterloo"));
    undergroundSystem.checkOut(10, "Waterloo", 38);
    assertEquals(12.00000, undergroundSystem.getAverageTime("Leyton", "Waterloo"));

    assertEquals(List.of(true, true, true, false, true),
        new Solution_1431().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
  }

}