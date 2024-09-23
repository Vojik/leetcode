package com.vojik.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveTwoLetters {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCases = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < testCases; i++) {
      String line1 = sc.nextLine();
      String line2 = sc.nextLine();

      helper(line2);
    }
    sc.close();
  }

  private static void helper(String str) {
    Set<String> set = new HashSet<>();
    for (int i = 0; i < str.length() - 1; i++) {
      set.add(str.substring(0, i) + str.substring(i + 2));
    }
    System.out.println(set.size());
  }
}