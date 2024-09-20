package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution_Codeforce {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int iterations = sc.nextInt();
    for (int i = 0; i < iterations; i++) {
      int numOfElements = sc.nextInt();
      sc.nextLine();
      int[] p = transformStringToArray(sc.nextLine());
      String colors = sc.nextLine();
      System.out.println(calculate(p, colors));
    }
  }

  private static List<Set<Integer>> defineCycles(int[] p) {
    boolean[] visited = new boolean[p.length + 1];

    List<Set<Integer>> list = new ArrayList<>();
    for (int i = 0; i < p.length; i++) {
      if (!visited[i]) {
//        boolean alreadyExists = false;
//        for (Set<Integer> set : list) {
//          if (set.contains(i + 1)) {
//            alreadyExists = true;
//          }
//        }
//        if (alreadyExists) {
//          continue;
//        }
        Set<Integer> set = new HashSet<>();
        int current = p[i];
        set.add(i + 1);
        while (current != i + 1) {
          visited[current] = true;
          set.add(current);
          current = p[current - 1];
        }
        list.add(set);
      }
    }
    return list;
  }

  private static int[] calculate(int[] p, String colors) {
    List<Set<Integer>> cycles = defineCycles(p);
    int[] calculatedColors = countColors(cycles, colors);
    int[] result = new int[p.length];

    for (int i = 0; i < p.length; i++) {
      int current = i + 1;
      for (int j = 0; j < cycles.size(); j++) {
        if (cycles.get(j).contains(current)) {
          result[i] = calculatedColors[j];
          break;
        }
      }
    }
    return result;
  }

  private static int[] countColors(List<Set<Integer>> cycles, String colors) {
    int[] ans = new int[cycles.size()];
    int idx = 0;
    for (Set<Integer> cycle : cycles) {
      int count = 0;
      for (Integer c : cycle) {
        if (colors.charAt(c - 1) == '0') {
          count++;
        }
      }
      ans[idx++] = count;
    }
    return ans;
  }

  private static int[] transformStringToArray(String input) {
    String[] stringArray = input.split(" ");
    int[] intArray = new int[stringArray.length];
    for (int i = 0; i < stringArray.length; i++) {
      intArray[i] = Integer.parseInt(stringArray[i]);
    }
    return intArray;
  }
}
