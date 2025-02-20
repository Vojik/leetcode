package com.vojik.interviews;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Meta_2025Test {

  @Test
  public void test1_whenSolution1() {
    Set<String> expected = Set.of(
        "-1+2-3+4+5+6+78+9",
        "1+2+3-4+5+6+78+9",
        "1+2+34-5+67-8+9",
        "1+23-4+5+6+78-9",
        "1+23-4+56+7+8+9",
        "12+3+4+5-6-7+89",
        "12+3-4+5+67+8+9",
        "12-3-4+5-6+7+89",
        "123+4-5+67-89",
        "123+45-67+8-9",
        "123-4-5-6-7+8-9",
        "123-45-67+89"
    );
    List<String> result = new Meta_2025().allCombinationsOfTarget();
    assertEquals(result.size(), expected.size());
    result.forEach(str -> assertTrue(expected.contains(str)));
  }

}