package com.vojik.solutions;

/**
 * 12. Integer to Roman
 */
public class Solution_12 {

  public String intToRoman(int num) {
    StringBuilder sb = new StringBuilder();
    int temp = num / 1000;
    if (temp > 0) {
      num -= temp * 1000;
      while (temp != 0) {
        sb.append("M");
        temp--;
      }
    }

    temp = num / 100;
    if (temp > 0) {
      sb.append(helper(temp, "CM", "CD", "D", "C"));
      num -= temp * 100;
    }

    temp = num / 10;
    if (temp > 0) {
      sb.append(helper(temp, "XC", "XL", "L", "X"));
      num -= temp * 10;
    }

    if (num > 0) {
      sb.append(helper(num, "IX", "IV", "V", "I"));
    }

    return sb.toString();
  }

  private String helper(int num, String nine, String four, String five, String single) {
    if (num == 9) {
      return nine;
    } else if (num == 4) {
      return four;
    } else {
      StringBuilder sb = new StringBuilder();
      if (num >= 5) {
        num -= 5;
        sb.append(five);
      }
      while (num != 0) {
        sb.append(single);
        num--;
      }
      return sb.toString();
    }
  }
}
