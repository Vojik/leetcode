package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_609Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        List.of(
            List.of("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"),
            List.of("root/a/1.txt", "root/c/3.txt")
        ),
        new Solution_609().findDuplicate(
            new String[] {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"}
        )
    );
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        List.of(
            List.of("root/a/2.txt", "root/c/d/4.txt"),
            List.of("root/a/1.txt", "root/c/3.txt")
        ),
        new Solution_609().findDuplicate(
            new String[] {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)"}
        )
    );
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(
        List.of(),
        new Solution_609().findDuplicate(
            new String[] {"root/a 1.txt(abcd) 2.txt(efsfgh)", "root/c 3.txt(abdfcd)",
                "root/c/d 4.txt(efggdfh)"}
        )
    );
  }
}