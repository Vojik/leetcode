package com.vojik.codeforces;

import static com.vojik.codeforces.Utils.transformStringToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YoungExplorers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCases = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < testCases; i++) {
      int size = Integer.parseInt(sc.nextLine());
      int[] explorers = transformStringToArray(sc.nextLine());
      System.out.println(calculateGroups(explorers));
    }
    sc.close();
  }

  private static int calculateGroups(int[] explorers) {
    Arrays.sort(explorers);
    int groups = 0;
    List<Integer> list = new ArrayList<>();
    for (int explorer : explorers) {
      list.add(explorer);

      if (list.size() >= explorer) {
        groups++;
        list.clear();
      }
    }
    return groups;
  }
}
