package com.vojik.codeforces;

import static com.vojik.codeforces.Utils.transformStringToArray;

import java.util.Arrays;
import java.util.Scanner;

public class ChoosingCubes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCases = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < testCases; i++) {
      String line1 = sc.nextLine();
      String arr[] = line1.split(" ");
      int size = Integer.parseInt(arr[0]);
      int favoriteCubeIdx = Integer.parseInt(arr[1]);
      int k = Integer.parseInt(arr[2]);

      String line2 = sc.nextLine();
      int[] cubeValues = transformStringToArray(line2);

      chooseCube(size, cubeValues, favoriteCubeIdx, k);
    }
    sc.close();
  }

  private static void chooseCube(int size, int[] cubeValues, int favoriteCubeIdx, int k) {
    if (k == size) {
      System.out.println("YES");
      return;
    }

    int favoriteCube = cubeValues[favoriteCubeIdx - 1];
    int lastAvailableIdx = size - 1 - k;

    Arrays.sort(cubeValues);

    if (cubeValues[lastAvailableIdx] == favoriteCube
        && cubeValues[lastAvailableIdx + 1] == favoriteCube) {
      System.out.println("MAYBE");
    } else if (cubeValues[lastAvailableIdx] < favoriteCube) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
