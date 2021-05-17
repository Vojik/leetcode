package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/** 398. Random Pick Index */
public class Solution_398 {

  private Map<Integer, List<Integer>> freq;
  private Random random;

  public Solution_398(int[] nums) {
    this.random = new Random();
    this.freq = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      List<Integer> indeces = freq.getOrDefault(nums[i], new ArrayList<>());
      indeces.add(i);
      freq.put(nums[i], indeces);
    }
  }

  public int pick(int target) {
    List<Integer> indeces = freq.get(target);
    return indeces.get(random.nextInt(indeces.size()));
  }
}
