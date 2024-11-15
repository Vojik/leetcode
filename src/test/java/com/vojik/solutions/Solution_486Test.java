package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_486Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("IPv4", new Solution_486().validIPAddress("172.16.254.1"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("IPv6", new Solution_486().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("Neither", new Solution_486().validIPAddress("256.256.256.256"));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals("Neither",
        new Solution_486().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals("Neither", new Solution_486().validIPAddress("1.0.1."));
  }

}