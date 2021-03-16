package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 535. Encode and Decode TinyURL
 */
public class Solution_535 {

  private static final String BASE_62_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  private static final String BASE_URL = "http://tinyurl.com/";
  private Map<String, String> cache = new HashMap<>();

  // Encodes a URL to a shortened URL.
  public String encode(String longUrl) {
    String code = "";
    while (true) {
      code = generateCode();
      if (cache.containsKey(code)) {
        continue;
      }
      cache.put(code, longUrl);
      break;
    }
    return BASE_URL + code;
  }

  // Decodes a shortened URL to its original URL.
  public String decode(String shortUrl) {
    String code = shortUrl.substring(BASE_URL.length());
    String decoded = cache.get(code);
    if (decoded == null) {
      throw new IllegalArgumentException("No such short url");
    }
    return decoded;
  }

  private String generateCode() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      sb.append(BASE_62_CHARS.charAt((int) (Math.random() * BASE_62_CHARS.length())));
    }
    return sb.toString();
  }
}
