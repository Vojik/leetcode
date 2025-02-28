package com.vojik.solutions

class Solution_6_Kotlin {

  fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s;
    val array = Array(numRows) { StringBuilder() }
    var direction = -1
    var currentLine = 0
    for (char in s) {
      array[currentLine].append(char)
      if (currentLine == 0) {
        direction = 1
      } else if (currentLine == numRows - 1) {
        direction = -1
      }
      currentLine += direction
    }
    val ans = StringBuilder()
    for (sb in array) {
      ans.append(sb)
    }
    return ans.toString()
  }
}