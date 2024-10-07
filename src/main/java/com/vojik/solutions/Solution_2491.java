package com.vojik.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 2491. Divide Players Into Teams of Equal Skill
 */
public class Solution_2491 {

  public long dividePlayers(int[] skill) {
    Arrays.sort(skill);
    int left = 0;
    int right = skill.length - 1;
    int skillVal = skill[left] + skill[right];
    long ans = skill[left++] * skill[right--];
    while (left < right) {
      int l = skill[left++];
      int r = skill[right--];
      if (l + r != skillVal) {
        return -1;
      }
      ans += l * r;
    }
    return ans;
  }

  public long dividePlayers2(int[] skill) {
    int n = skill.length;
    int totalSkills = 0;
    Map<Integer, Integer> freq = new HashMap<>();
    for (int s : skill) {
      totalSkills += s;
      freq.put(s, freq.getOrDefault(s, 0) + 1);
    }

    if (totalSkills % (n / 2) != 0) {
      return -1;
    }

    int targetSkill = totalSkills / (n / 2);

    int ans = 0;
    for (int playerSkill : freq.keySet()) {
      int currFreq = freq.get(playerSkill);
      int partnerSkill = targetSkill - playerSkill;

      if (!Objects.equals(freq.get(partnerSkill), currFreq)) {
        return -1;
      }
      ans += (long) playerSkill * (long) partnerSkill * (long) currFreq;;
    }

    return ans / 2;
  }
}
