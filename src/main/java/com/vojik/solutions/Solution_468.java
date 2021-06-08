package com.vojik.solutions;

/** 468. Validate IP Address */
public class Solution_468 {

  public String validIPAddress(String IP) {
    if (IP == null || IP.length() == 0) {
      return "Neither";
    }

    if (isValidIp4(IP)) {
      return "IPv4";
    }

    if (isValidIp6(IP)) {
      return "IPv6";
    }
    return "Neither";
  }

  private boolean isValidIp4(String IP) {
    if (IP.startsWith(".") || IP.endsWith(".")) {
      return false;
    }
    String[] values = IP.split("\\.");
    if (values.length != 4) {
      return false;
    }
    for (String val : values) {
      if (val.isEmpty()) {
        return false;
      }
      if (val.startsWith("0") && val.length() > 1) {
        return false;
      }
      try {
        int intVal = Integer.valueOf(val);
        if (intVal < 0 || intVal > 255) {
          return false;
        }
      } catch (Exception ex) {
        return false;
      }
    }
    return true;
  }

  private boolean isValidIp6(String IP) {
    if (IP.startsWith(":") || IP.endsWith(":")) {
      return false;
    }

    String[] values = IP.split(":");
    if (values.length != 8) {
      return false;
    }
    for (String val : values) {
      if (val.isEmpty()) {
        return false;
      }
      if (val.length() > 4) {
        return false;
      }
      for (int i = 0; i < val.length(); i++) {
        char ch = val.charAt(i);
        if (Character.isLowerCase(ch) && ch > 'f') {
          return false;
        }
        if (Character.isUpperCase(ch) && ch > 'F') {
          return false;
        }
      }
    }
    return true;
  }
}
