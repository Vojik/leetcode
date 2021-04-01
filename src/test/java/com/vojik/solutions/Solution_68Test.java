package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_68Test {

  @Test
  public void test1_whenSolution1() {
    List<String> actual = new Solution_68()
        .fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."},
            16);
    List<String> expected = List.of("This    is    an", "example  of text", "justification.  ");
    assertTrue(actual.size() == expected.size());
    assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
  }

  @Test
  public void test2_whenSolution1() {
    List<String> actual = new Solution_68()
        .fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"},
            16);
    List<String> expected = List.of("What   must   be", "acknowledgment  ", "shall be        ");
    assertTrue(actual.size() == expected.size());
    assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
  }

  @Test
  public void test3_whenSolution1() {
    List<String> actual = new Solution_68()
        .fullJustify(
            new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to",
                "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"},
            20);
    List<String> expected = List
        .of("Science  is  what we", "understand      well", "enough to explain to",
            "a  computer.  Art is", "everything  else  we", "do                  ");
    assertTrue(actual.size() == expected.size());
    assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
  }

}