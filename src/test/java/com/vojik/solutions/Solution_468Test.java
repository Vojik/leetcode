package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Solution_468Test {

  @ParameterizedTest
  @ValueSource(strings = {"172.16.254.1", "192.168.1.1"})
  public void testIp4_whenSolution1(String str) {
    Assertions.assertEquals("IPv4", new Solution_468().validIPAddress(str));
  }

  @ParameterizedTest
  @ValueSource(strings = {"2001:0db8:85a3:0:0:8A2E:0370:7334"})
  public void testIp6_whenSolution1(String str) {
    Assertions.assertEquals("IPv6", new Solution_468().validIPAddress(str));
  }

  @ParameterizedTest
  @ValueSource(strings = {"256.256.256.256", "2001:0db8:85a3:0:0:8A2E:0370:7334:", "1e1.4.5.6"})
  public void testNeither_whenSolution1(String str) {
    Assertions.assertEquals("Neither", new Solution_468().validIPAddress(str));
  }
}
