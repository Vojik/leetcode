package com.vojik.solutions;

/**
 * 121. Best Time to Buy and Sell Stock
 */
public class Solution_121 {

  // Time: O(n) Space:O(1)
  public int maxProfit(int[] prices) {
    int sell = 0;
    int buy = Integer.MAX_VALUE;

    for (int i = 0; i < prices.length; i++) {
      buy = Math.min(prices[i], buy);
      sell = Math.max(prices[i] - buy, sell);
    }
    return sell;
  }
}