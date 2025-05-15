package com.vojik.solutions;


/**
 * 1971. Find if Path Exists in Graph
 */
public class Solution_1971 {

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    UnionFind uf = new UnionFind(n);
    for (int[] edge : edges) {
      uf.union(edge[0], edge[1]);
    }

    return uf.isConnected(source, destination);
  }
}

class UnionFind {

  private int[] nodes;
  private int[] size;

  public UnionFind(int n) {
    this.nodes = new int[n];
    this.size = new int[n];
    for (int i = 0; i < n; i++) {
      nodes[i] = i;
      size[i] = 1;
    }
  }

  public int find(int e) {
    while (e != nodes[e]) {
      e = nodes[e];
    }
    return e;
  }

  public void union(int p, int q) {
    int rootP = find(p);
    int rootQ = find(q);
    if (rootP == rootQ) {
      return;
    }

    if (size[rootP] < size[rootQ]) {
      nodes[rootP] = rootQ;
      size[rootQ] += size[rootP];
    } else {
      nodes[rootQ] = rootP;
      size[rootP] += size[rootQ];
    }
  }

  public boolean isConnected(int p, int q) {
    return find(p) == find(q);
  }
}


