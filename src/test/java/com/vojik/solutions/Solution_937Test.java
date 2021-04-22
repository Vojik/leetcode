package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_937Test {

  @Test
  public void test1_whenSolution1() {
    String[] input = new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig",
        "let3 art zero"};
    String[] expected = new String[]{"let1 art can", "let3 art zero", "let2 own kit dig",
        "dig1 8 1 5 1", "dig2 3 6"};
    Assertions.assertArrayEquals(expected, new Solution_937().reorderLogFiles(input));
  }

  @Test
  public void test2_whenSolution1() {
    String[] input = new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog",
        "a8 act zoo"};
    String[] expected = new String[]{"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1",
        "zo4 4 7"};
    Assertions.assertArrayEquals(expected, new Solution_937().reorderLogFiles(input));
  }

  @Test
  public void test3_whenSolution1() {
    String[] input = new String[]{"ond 5092781 316 6704", "8qt 089 1 505824730",
        "ty szwmdr fqf nlums", "06hy thfo ofhdibrnc", "f 341750204886995331",
        "rab lxyhr xhlpkk t q", "54a 4 240 48299311 0", "nqp2o jrlokgypqh op",
        "jxc lafwu p ctjjj vv", "6c 944639313298 221", "hd6 dhdhajyqylb m c", "qp 5014057259194839",
        "3ljd2 cbvoeej da lro", "6lxa l xrvmcmsfdzlq", "zotrq 19964 46917945",
        "7m cecsiar vxp yksaq", "uktnk mgaa hbvc vt t", "p3 lseldodyxhiazo z",
        "xp sgiea f r mhnsqeu", "syufn 7 54169586 8 9"};
    String[] expected = new String[]{"3ljd2 cbvoeej da lro", "7m cecsiar vxp yksaq",
        "hd6 dhdhajyqylb m c", "nqp2o jrlokgypqh op", "6lxa l xrvmcmsfdzlq", "jxc lafwu p ctjjj vv",
        "p3 lseldodyxhiazo z", "rab lxyhr xhlpkk t q", "uktnk mgaa hbvc vt t",
        "xp sgiea f r mhnsqeu", "ty szwmdr fqf nlums", "06hy thfo ofhdibrnc",
        "ond 5092781 316 6704", "8qt 089 1 505824730", "f 341750204886995331",
        "54a 4 240 48299311 0", "6c 944639313298 221", "qp 5014057259194839",
        "zotrq 19964 46917945", "syufn 7 54169586 8 9"};
    Assertions.assertArrayEquals(expected, new Solution_937().reorderLogFiles(input));
  }
}