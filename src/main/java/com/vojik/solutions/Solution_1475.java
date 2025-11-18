package com.vojik.solutions;

import java.util.Arrays;
import java.util.Stack;

/** 1475. Final Prices With a Special Discount in a Shop */
public class Solution_1475 {

  public int[] finalPrices(int[] prices) {
    int len = prices.length;
    int[] answer = Arrays.copyOf(prices, len);
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < len; i++) {
      while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
        int idx = stack.pop();
        answer[idx] = prices[idx] - prices[i];
      }
      stack.push(i);
    }
    return answer;
  }
}
