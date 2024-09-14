package com.vojik.solutions;

/**
 * 1310. XOR Queries of a Subarray
 */
public class Solution_1310 {

  public int[] xorQueries(int[] arr, int[][] queries) {
    int[] ans = new int[queries.length];
    for (int i = 0; i < ans.length; i++) {
      int current = 0;
      for (int j = queries[i][0]; j <= queries[i][1]; j++) {
        current = current ^ arr[j];
      }
      ans[i] = current;
    }
    return ans;
  }

  public int[] xorQueries2(int[] arr, int[][] queries) {
    int[] ans = new int[queries.length];

    int[] prefixXOR = new int[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
      prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
    }

    for (int i = 0; i < queries.length; i++) {
      ans[i] = prefixXOR[queries[i][1] + 1] ^ prefixXOR[queries[i][0]];
    }

    return ans;
  }
}
