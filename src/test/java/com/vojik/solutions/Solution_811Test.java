package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_811Test {

  @Test
  public void test1_whenSolution1() {
    List<String> actual = new Solution_811()
        .subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
    List<String> expected = List.of("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com");
    assertEquals(expected.size(), actual.size());
    assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
  }

  @Test
  public void test2_whenSolution1() {
    List<String> actual = new Solution_811()
        .subdomainVisits(
            new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    List<String> expected = List
        .of("901 mail.com", "50 yahoo.com", "900 google.mail.com", "5 wiki.org", "5 org",
            "1 intel.mail.com", "951 com");
    assertEquals(expected.size(), actual.size());
    assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
  }

}