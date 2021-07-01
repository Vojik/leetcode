package com.vojik.solutions;

/** 38. Count and Say */
public class Solution_38 {

  public String countAndSay(int n) {
    int i = 2;
    String ans = "1";
    while (i <= n) {
      ans = helper(String.valueOf(ans));
      i++;
    }
    return ans;
  }

  private String helper(String str) {
    int count = 1;
    int num = Character.getNumericValue(str.charAt(0));
    StringBuilder result = new StringBuilder();
    for (int i = 1; i < str.length(); i++) {
      int currentNum = Character.getNumericValue(str.charAt(i));
      if (currentNum != num) {
        result.append(count);
        result.append(num);
        num = currentNum;
        count = 1;
      } else {
        count++;
      }
    }
    result.append(count);
    result.append(num);
    return result.toString();
  }
}
