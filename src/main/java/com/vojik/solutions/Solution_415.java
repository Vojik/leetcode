package com.vojik.solutions;

/**
 * 415. Add Strings
 */
public class Solution_415 {
  public String addStrings(String num1, String num2) {

    StringBuilder result = new StringBuilder();
    int cursor1 = num1.length() - 1;
    int cursor2 = num2.length() - 1;


    int carry = 0;
    while (cursor1 >= 0 || cursor2 >= 0) {
      int n1 = cursor1 >= 0 ? num1.charAt(cursor1) - '0' : 0;
      int n2 = cursor2 >= 0 ? num2.charAt(cursor2) - '0' : 0;

      int current = n1 + n2 + carry;
      result.append(current % 10);
      carry = current / 10;

      cursor1--;
      cursor2--;
    }
    if (carry == 1) {
      result.append(1);
    }
    return result.reverse().toString();
  }
}