package com.vojik.solutions;

/**
 * 744. Find Smallest Letter Greater Than Target
 *
 * <p>Given a list of sorted characters letters containing only lowercase letters, and given a
 * target letter target, find the smallest element in the list that is larger than the given target.
 *
 * <p>Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'],
 * the answer is 'a'.
 *
 * <p>Examples: Input: letters = ["c", "f", "j"] target = "a" Output: "c"
 *
 * <p>Input: letters = ["c", "f", "j"] target = "c" Output: "f"
 *
 * <p>Input: letters = ["c", "f", "j"] target = "d" Output: "f"
 *
 * <p>Input: letters = ["c", "f", "j"] target = "g" Output: "j"
 *
 * <p>Input: letters = ["c", "f", "j"] target = "j" Output: "c"
 *
 * <p>Input: letters = ["c", "f", "j"] target = "k" Output: "c"
 *
 * <p>Note: 1. letters has a length in range [2, 10000]. 2. letters consists of lowercase letters,
 * and contains at least 2 unique letters. 3. target is a lowercase letter.
 */
public class Solution_744 {

  // Time: O(lon(n)) Space: O(1)
  public char nextGreatestLetter(char[] letters, char target) {
    int left = 0;
    int right = letters.length - 1;

    while (left < right) {
      int mid = (left + right) / 2;

      if (letters[mid] == target) {
        left = mid;
        break;
      } else if (letters[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    if (letters[left] > target) {
      return letters[left];
    } else if (letters[left] < target) {
      return left + 1 < letters.length ? letters[left + 1] : letters[0];
    }

    // if equal - go to the next unique
    char cur = letters[left];
    while (left < letters.length && letters[left] == cur) {
      left++;
    }
    return left < letters.length ? letters[left] : letters[0];
  }

  public char nextGreatestLetterOptimal(char[] letters, char target) {
    int left = 0;
    int right = letters.length;

    while (left < right) {
      int mid = (left + right) / 2;
      if (letters[mid] <= target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return letters[left % letters.length];
  }

  public char nextGreatestLetter2(char[] letters, char target) {
    int lo = 0;
    int hi = letters.length - 1;
    char ans = letters[0];
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (Character.getNumericValue(letters[mid]) > Character.getNumericValue(target)) {
        ans = letters[mid];
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return ans;
  }
}
