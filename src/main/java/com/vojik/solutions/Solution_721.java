package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 721. Accounts Merge
 */
public class Solution_721 {

  public List<List<String>> accountsMerge(List<List<String>> accounts) {
    Set<String> visited = new HashSet();
    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> emailToList = buildGraph(accounts);

    for (List<String> account : accounts) {
      String name = account.get(0);
      String firstEmail = account.get(1);
      if (!visited.contains(firstEmail)) {
        LinkedList<String> mergedAccounts = new LinkedList<>();
        dfs(firstEmail, mergedAccounts, emailToList, visited);
        Collections.sort(mergedAccounts);
        mergedAccounts.addFirst(name);
        result.add(mergedAccounts);
      }
    }
    return result;
  }

  private List<String> dfs(String email, List<String> mergedAccounts,
      Map<String, List<String>> emailToList, Set<String> visited) {
    if (visited.contains(email)) {
      return mergedAccounts;
    }
    visited.add(email);
    mergedAccounts.add(email);
    List<String> connections = emailToList.get(email);
    for (String connectionEmail : connections) {
      dfs(connectionEmail, mergedAccounts, emailToList, visited);
    }
    return mergedAccounts;
  }

  private Map<String, List<String>> buildGraph(List<List<String>> accounts) {
    Map<String, List<String>> emailToList = new HashMap<>();
    for (List<String> account : accounts) {
      String firstEmail = account.get(1);
      if (!emailToList.containsKey(firstEmail)) {
        emailToList.put(firstEmail, new ArrayList<String>());
      }
      for (int i = 2; i < account.size(); i++) {
        String email = account.get(i);
        emailToList.get(firstEmail).add(email);

        if (!emailToList.containsKey(email)) {
          emailToList.put(email, new ArrayList<String>());
        }
        emailToList.get(email).add(firstEmail);
      }
    }
    return emailToList;
  }
}

