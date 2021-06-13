package com.vojik.solutions;

import java.util.Random;

/** 384. Shuffle an Array */
public class Solution_384 {

  private final int[] array;
  private final Random random;
  private final int arrayLen;

  public Solution_384(int[] nums) {
    this.array = nums;
    this.random = new Random();
    this.arrayLen = array.length;
  }

  /** Resets the array to its original configuration and return it. */
  public int[] reset() {
    return array;
  }

  /** Returns a random shuffling of the array. */
  public int[] shuffle() {
    int[] result = new int[arrayLen];
    System.arraycopy(array, 0, result, 0, arrayLen);
    for (int i = 0; i < arrayLen; i++) {
      int randomIdx = random.nextInt(arrayLen);
      int temp = result[randomIdx];
      result[randomIdx] = result[i];
      result[i] = temp;
    }
    return result;
  }
}
