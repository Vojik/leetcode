package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_412Test {

  @Test
  public void test1_whenSolution1() {
    List<String> actual = Solution_412.solution1(1);
    Assertions.assertIterableEquals(List.of("1"), actual);
  }

  @Test
  public void test2_whenSolution1() {
    List<String> actual = Solution_412.solution1(15);
    Assertions.assertIterableEquals(List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), actual);
  }

  @Test
  public void test3_whenSolution1() {
    List<String> actual = Solution_412.solution1(30);
    Assertions.assertIterableEquals(List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29","FizzBuzz"), actual);
  }

  @Test
  public void test4_whenSolution1() {
    List<String> actual = Solution_412.solution1(-7);
    Assertions.assertIterableEquals(List.of(), actual);
  }

  @Test
  public void test5_whenSolution1() {
    List<String> actual = Solution_412.solution1(0);
    Assertions.assertIterableEquals(List.of(), actual);
  }
}