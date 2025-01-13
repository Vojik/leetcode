package com.vojik.solutions;

import java.util.Map;

/**
 * 273. Integer to English Words
 */
public class Solution_273 {

  public String one(int num) {
    switch (num) {
      case 1:
        return "One";
      case 2:
        return "Two";
      case 3:
        return "Three";
      case 4:
        return "Four";
      case 5:
        return "Five";
      case 6:
        return "Six";
      case 7:
        return "Seven";
      case 8:
        return "Eight";
      case 9:
        return "Nine";
    }
    return "";
  }

  public String twoLessThan20(int num) {
    switch (num) {
      case 10:
        return "Ten";
      case 11:
        return "Eleven";
      case 12:
        return "Twelve";
      case 13:
        return "Thirteen";
      case 14:
        return "Fourteen";
      case 15:
        return "Fifteen";
      case 16:
        return "Sixteen";
      case 17:
        return "Seventeen";
      case 18:
        return "Eighteen";
      case 19:
        return "Nineteen";
    }
    return "";
  }

  public String ten(int num) {
    switch (num) {
      case 2:
        return "Twenty";
      case 3:
        return "Thirty";
      case 4:
        return "Forty";
      case 5:
        return "Fifty";
      case 6:
        return "Sixty";
      case 7:
        return "Seventy";
      case 8:
        return "Eighty";
      case 9:
        return "Ninety";
    }
    return "";
  }


  public String numberToWords(int num) {
    if (num == 0) {
      return "Zero";
    }
    StringBuilder sb = new StringBuilder();
    String str = String.valueOf(num);

    if (str.length() == 10) {
      sb.append(handleBillion(str));
      str = str.substring(1, str.length());
    }
    if (str.length() >= 7 && str.length() <= 9) {
      sb.append(handleMillion(str));
      str = str.substring(str.length() - 6, str.length());
    }
    if (str.length() >= 4 && str.length() <= 6) {
      sb.append(handleThousand(str));
      str = str.substring(str.length() - 3, str.length());
    }
    if (str.length() == 3) {
      sb.append(handleHundred(str));
    } else if (str.length() == 2) {
      sb.append(handleUnderHundred(str));
    } else {
      sb.append(one(Integer.parseInt(str)));
    }
    return sb.toString().trim();

  }

  public String handleBillion(String str) {
    return str.startsWith("1") ? "One Billion " : "Two Billion ";
  }

  public String handleMillion(String str) {
    String milStr = str.substring(0, str.length() - 6);
    String res = "";
    if (milStr.length() == 3) {
      res = handleHundred(milStr);
    } else if (milStr.length() == 2) {
      res = handleUnderHundred(milStr);
    } else {
      res = one(Integer.parseInt(milStr));
    }
    if (!res.isBlank()) {
      res += " Million ";
    }
    return res;
  }

  public String handleThousand(String str) {
    String thoStr = str.substring(0, str.length() - 3);
    String res = "";
    if (thoStr.length() == 3) {
      res = handleHundred(thoStr);
    } else if (thoStr.length() == 2) {
      res = handleUnderHundred(thoStr);
    } else {
      res = one(Integer.parseInt(thoStr));
    }
    if (!res.isBlank()) {
      res += " Thousand ";
    }
    return res;
  }

  public String handleHundred(String str) {
    if (str.equals("000")) {
      return "";
    }
    String one = one(Integer.parseInt(str.substring(0, 1)));
    if (!one.isBlank()) {
      one += " Hundred ";
    }

    return (one + handleUnderHundred(str.substring(1, str.length()))).trim();
  }

  public String handleUnderHundred(String str) {
    if (str.length() == 2 && str.startsWith("1")) {
      return twoLessThan20(Integer.parseInt(str));
    } else if (str.length() == 2 && str.startsWith("0")) {
      return one(Integer.parseInt(str.substring(1, str.length())));
    }
    String ten = ten(Integer.parseInt(str.substring(0, 1)));
    if (!ten.isBlank()) {
      ten += " ";
    }

    return (ten + one(Integer.parseInt(str.substring(1, str.length())))).trim();
  }

  /**
   * =========================================================================================================
   */
  private Map<Integer, String> singles = Map.of(0, "Zero", 1, "One", 2, "Two", 3, "Three", 4,
      "Four", 5, "Five", 6, "Six", 7, "Seven", 8, "Eight", 9, "Nine");

  private Map<Integer, String> beforeTwenty = Map.of(10, "Ten", 11, "Eleven", 12, "Twelve", 13,
      "Thirteen", 14, "Fourteen", 15, "Fifteen", 16, "Sixteen", 17, "Seventeen", 18, "Eighteen", 19,
      "Nineteen");

  private Map<Integer, String> beforeHundred = Map.of(2, "Twenty", 3, "Thirty", 4, "Forty", 5,
      "Fifty", 6, "Sixty", 7, "Seventy", 8, "Eighty", 9, "Ninety");

  public String numberToWords2(int num) {
    if (num < 10) {
      return singles.get(num);
    } else if (num < 20) {
      return beforeTwenty.get(num);
    } else if (num < 100) {
      return beforeHundred.get(num / 10) + (num % 10 != 0 ? " " + numberToWords2(num % 10) : "");
    } else if (num < 1000) {
      return numberToWords2(num / 100) + " Hundred" + (num % 100 != 0 ? " " + numberToWords2(
          num % 100) : "");
    } else if (num < 1000000) {
      return numberToWords2(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + numberToWords2(
          num % 1000) : "");
    } else if (num < 1000000000) {
      return numberToWords2(num / 1000000) + " Million" + (num % 1000000 != 0 ? " "
          + numberToWords2(
          num % 1000000) : "");
    }
    return numberToWords2(num / 1000000000) + " Billion" + (num % 1000000000 != 0 ? " "
        + numberToWords2(num % 1000000000) : "");
  }
}
