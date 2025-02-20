package com.vojik.interviews;

import java.util.ArrayList;
import java.util.List;

public class Meta_2025 {

  /**
   * 1. Behaviour questions: - the project you proud of - deep dive into project
   * <p>
   * 2. 680. Valid Palindrome II
   * <p>
   * 3. 123456789 = 100 (also known as targetSum)
   * <p>
   * Using standard integer arithmetic operators +, -, how many different solutions can you find by
   * inserting the operators between some digits?
   * <pre>
   * All combinations that sums up to 100:
   * -1+2-3+4+5+6+78+9
   * 1+2+3-4+5+6+78+9
   * 1+2+34-5+67-8+9
   * 1+23-4+5+6+78-9
   * 1+23-4+56+7+8+9
   * 12+3+4+5-6-7+89
   * 12+3-4+5+67+8+9
   * 12-3-4+5-6+7+89
   * 123+4-5+67-89
   * 123+45-67+8-9
   * 123-4-5-6-7+8-9
   * 123-45-67+89
   * </pre>
   */
  public List<String> allCombinationsOfTarget() {
    String str = "123456789";
    List<String> result = new ArrayList<>();
    helper(str, 0, 0, 100, new StringBuilder(), result);
    return result;
  }

  private void helper(String s, int start, int sum, int target, StringBuilder path,
      List<String> result) {
    if (start == s.length()) {
      if (sum == target) {
        result.add(path.toString());
      }
      return;
    }

    int len = path.length();
    int num = 0;
    for (int i = start; i < s.length(); i++) {
      num = 10 * num + s.charAt(i) - '0';

      if (start != 0) {
        path.append('+');
      }
      path.append(num);
      helper(s, i + 1, sum + num, target, path, result);
      path.setLength(len);

      path.append('-');
      path.append(num);
      helper(s, i + 1, sum - num, target, path, result);
      path.setLength(len);
    }
  }


}
