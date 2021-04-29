package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_616Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("<b>abc</b>xyz<b>123</b>",
        new Solution_616().addBoldTag("abcxyz123", new String[]{"abc", "123"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("<b>aaabbc</b>c",
        new Solution_616().addBoldTag("aaabbcc", new String[]{"aaa", "aab", "bc"}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(
        "<b>qrzjsorbkmyzzzvoqxefvxkcwtpk</b>hzbakuufbpgdky<b>km</b>ojwuennrjeciqvvacpzrrczfhxnsmginzwinzihpomxtmwey<b>yzz</b>mgcoiupjnidphvzlnxtcogufozlenjf<b>vo</b>kztghwckzyvmktduqkizixzxpanjwrdeudjyftxksjgdklwxrhmudhrtemuvelykqaafzlqmennttkighcdxfozdcoqkyshhajipnsdrljrnlwmyjuwxsebpqm",
        new Solution_616().addBoldTag(
            "qrzjsorbkmyzzzvoqxefvxkcwtpkhzbakuufbpgdkykmojwuennrjeciqvvacpzrrczfhxnsmginzwinzihpomxtmweyyzzmgcoiupjnidphvzlnxtcogufozlenjfvokztghwckzyvmktduqkizixzxpanjwrdeudjyftxksjgdklwxrhmudhrtemuvelykqaafzlqmennttkighcdxfozdcoqkyshhajipnsdrljrnlwmyjuwxsebpqm",
            new String[]{"qr", "zj", "so", "rb", "km", "yz", "zz", "vo", "qx", "ef", "vx", "kc",
                "wt", "pk"}));
  }
}
