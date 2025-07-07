package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_271Test {

  @Test
  public void test1_whenSolution1() {
    List<String> list = List.of("Hello", "World");
    String encoded = new Solution_271().encode(list);
    assertEquals(
        new Solution_271().decode(encoded), list);
  }

  @Test
  public void test2_whenSolution1() {
    List<String> list = List.of("");
    String encoded = new Solution_271().encode(list);
    assertEquals(
        new Solution_271().decode(encoded), list);
  }

  @Test
  public void test3_whenSolution1() {
    List<String> list = List.of("#");
    String encoded = new Solution_271().encode(list);
    assertEquals(
        new Solution_271().decode(encoded), list);
  }

  @Test
  public void test4_whenSolution1() {
    List<String> list = List.of(
        "[\"U+I;1U!PT4=C, N9}=?k(b)_4,tK^@Q?;M!5J?\",\"zQr4:xDL[<E@,)W^N8;2=Oh@gzMm6L1&`tgh^ZN@}^G}Fg_IHQS-|=^1ZksYr=+pub#8$sF2v#Xts\",\"gx2ts=r`t/a>)O6bjJ^c?nb=UNhhRX3-\",\"6-J0\",\"J{|O}1[?7lWCM]a&:YkG33;~u4!#q$p}@U$2pQ&FZ~3pwq^x=xb?oM{Q\",\":|A\",\"IXH`~E@p[\",\"XhO[#js*,*H\",\"2IAv+qKs{O@aBMDxRlG}Z,+)}qO[Sl8 #9{aJScZ>FzQX {R3o>rK(]QcRlg-J:th(~\",\"U;P N[rokvXh(E9k2=?7`/ Cyc8!HM+av1AVNm5f=<.?ak+Sac>e?h8ob|h)U?bU{@;$a7w7Fr\",\"y`g,n.Z1J81; ;VH!s`V5U?iAl)owoRc#UC2(~[x*Eoq|5vghwtbvq&lV?w nQv?s#&q6~d}@wM\",\"O}r+9|M9u}x;VIn;Zmw{*Fj-CV,yaGa%Yg9-H|n=Saipfti4O(,n^#RLfhAE=%At[bRzNm$hIPQf=Vi }#kk8U7\"]");
    String encoded = new Solution_271().encode(list);
    assertEquals(
        new Solution_271().decode(encoded), list);
  }

}