package com.vojik.codeforces;

import java.util.Scanner;

public class SlavicsExam {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCases = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < testCases; i++) {
      String s = sc.nextLine();
      String t = sc.nextLine();

      helper(s, t);
    }
    sc.close();
  }

  private static void helper(String s, String t) {
    int sIndex = 0;
    int tIndex = 0;
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    while (sIndex < sArray.length && tIndex < tArray.length) {
      if (sArray[sIndex] == '?' || sArray[sIndex] == tArray[tIndex]) {
        sArray[sIndex] = tArray[tIndex];
        tIndex++;
      }
      sIndex++;
    }

    if (tIndex < tArray.length) {
      System.out.println("NO");
      return;
    }

    for (int i = 0; i < sArray.length; i++) {
      if (sArray[i] == '?') {
        sArray[i] = 'a';
      }
    }

    System.out.println("YES");
    System.out.println(new String(sArray));
  }
}
