package com.vojik.solutions;

/**
 * 468. Validate IP Address
 */
public class Solution_486 {

  public String validIPAddress(String queryIP) {
    if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
      return isValidIPv4(queryIP);
    } else if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
      return isValidIPv6(queryIP);
    } else {
      return "Neither";
    }
  }

  private String isValidIPv4(String queryIP) {
    String[] chunks = queryIP.split("\\.", -1);
    for (String chunk : chunks) {
      if (chunk.length() == 0 || chunk.length() > 3) {
        return "Neither";
      }
      if (chunk.charAt(0) == '0' && chunk.length() != 1) {
        return "Neither";
      }
      for (char ch : chunk.toCharArray()) {
        if (!Character.isDigit(ch)) {
          return "Neither";
        }
      }
      if (Integer.parseInt(chunk) > 255) {
        return "Neither";
      }
    }
    return "IPv4";
  }

  private String isValidIPv6(String queryIP) {
    String[] chunks = queryIP.split(":", -1);
    int counter = 0;
    for (char ch : queryIP.toCharArray()) {
      if (ch == ':') {
        counter++;
      }
    }
    if (chunks.length != 8 || counter != 7) {
      return "Neither";
    }
    for (String chunk : chunks) {
      if (chunk.isEmpty() || chunk.length() > 4) {
        return "Neither";
      }
      for (char ch : chunk.toCharArray()) {
        if (Character.isDigit(ch) || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F')) {
          continue;
        }
        return "Neither";
      }
    }
    return "IPv6";
  }
}
