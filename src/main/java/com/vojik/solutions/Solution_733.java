package com.vojik.solutions;

/**
 * 733. Flood Fill
 */
public class Solution_733 {

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (image[sr][sc] == newColor) {
      return image;
    }
    helper(image, sr, sc, newColor, image[sr][sc]);
    return image;
  }

  private void helper(int[][] image, int sr, int sc, int newColor, int originColor) {
    if (sr < 0 || sr >= image.length
        || sc < 0
        || sc >= image[0].length
        || image[sr][sc] == newColor
        || image[sr][sc] != originColor) {
      return;
    }
    image[sr][sc] = newColor;
    helper(image, sr + 1, sc, newColor, originColor);
    helper(image, sr - 1, sc, newColor, originColor);
    helper(image, sr, sc + 1, newColor, originColor);
    helper(image, sr, sc - 1, newColor, originColor);
  }
}
