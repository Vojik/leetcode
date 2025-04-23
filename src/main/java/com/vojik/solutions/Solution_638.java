package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 638. Shopping Offers
 */
public class Solution_638 {

  private int ans = Integer.MAX_VALUE;

  public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
    compute(price, special, needs, 0, 0);
    return ans;
  }

  private void compute(List<Integer> price, List<List<Integer>> special, List<Integer> needs,
      int specialIdx, int amount) {
    if (isCompleted(needs)) {
      ans = Math.min(ans, amount);
    } else {

      if (specialIdx >= special.size()) {
        // apply general price
        for (int i = 0; i < needs.size(); i++) {
          amount += needs.get(i) * price.get(i);
        }
        ans = Math.min(ans, amount);
        return;
      }

      // no pick the current special
      compute(price, special, needs, specialIdx + 1, amount);

      // pick the cuurent special
      if (canBuy(needs, special.get(specialIdx))) {
        List<Integer> newNeeds = applySpecial(needs, special.get(specialIdx));
        int newAmount = amount + special.get(specialIdx).get(needs.size());
        compute(price, special, newNeeds, specialIdx, newAmount);
      }

    }
  }

  private boolean isCompleted(List<Integer> needs) {
    for (int n : needs) {
      if (n != 0) {
        return false;
      }
    }
    return true;
  }

  private boolean canBuy(List<Integer> needs, List<Integer> offer) {
    for (int i = 0; i < needs.size(); i++) {
      if (needs.get(i) < offer.get(i)) {
        return false;
      }
    }
    return true;
  }

  private List<Integer> applySpecial(List<Integer> needs, List<Integer> offer) {
    List<Integer> newNeeds = new ArrayList<>();
    for (int i = 0; i < needs.size(); i++) {
      newNeeds.add(needs.get(i) - offer.get(i));
    }
    return newNeeds;
  }
}
