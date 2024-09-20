package com.vojik.codeforces;

public final class Utils {

  private Utils() {
  }

  public static int[] transformStringToArray(String input) {
    String[] stringArray = input.split(" ");
    int[] intArray = new int[stringArray.length];
    for (int i = 0; i < stringArray.length; i++) {
      intArray[i] = Integer.parseInt(stringArray[i]);
    }
    return intArray;
  }

  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
  }

}
