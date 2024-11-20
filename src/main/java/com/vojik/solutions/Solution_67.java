package com.vojik.solutions;

/**
 * 67. Add Binary
 */
public class Solution_67 {

  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();

    char[] aChars = a.toCharArray();
    char[] bChars = b.toCharArray();

    int i = aChars.length - 1;
    int j = bChars.length - 1;
    int carry = 0;

    while (i >= 0 || j >= 0) {
      int val = carry;
      if (i >= 0) {
        val = val + aChars[i] - '0';
      }
      if (j >= 0) {
        val = val + bChars[j] - '0';
      }
      sb.append(val % 2);
      carry = val / 2;
      i--;
      j--;
    }
    if (carry == 1) {
      sb.append('1');
    }
    return sb.reverse().toString();
  }

  public String addBinary2(String a, String b) {
    int idx1 = a.length() - 1;
    int idx2 = b.length() - 1;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while (idx1 >= 0 || idx2 >= 0) {
      int x = idx1 >= 0 ? a.charAt(idx1) - '0' : 0;
      int y = idx2 >= 0 ? b.charAt(idx2) - '0' : 0;
      int res = x + y + carry;
      sb.append(res % 2);
      carry = res / 2;
      idx1--;
      idx2--;
    }
    if (carry > 0) {
      sb.append(1);
    }
    return sb.reverse().toString();
  }
}
