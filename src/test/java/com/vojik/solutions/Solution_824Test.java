package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_824Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        "Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa",
        new Solution_824().toGoatLatin(
            "Each word consists of lowercase and uppercase letters only"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        "Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
        new Solution_824().toGoatLatin(
            "I speak Goat Latin"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(
        "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
        new Solution_824().toGoatLatin(
            "The quick brown fox jumped over the lazy dog"));
  }

}