package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_355Test {

  @Test
  public void test1_whenSolution1() {
    Solution_355 twitter = new Solution_355();
    twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
    Assertions.assertEquals(List.of(5), twitter.getNewsFeed(
        1));  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
    twitter.follow(1, 2);    // User 1 follows user 2.
    twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
    Assertions.assertEquals(List.of(6, 5), twitter.getNewsFeed(
        1));  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
    twitter.unfollow(1, 2);  // User 1 unfollows user 2.
    Assertions.assertEquals(List.of(5), twitter.getNewsFeed(
        1));  // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
  }
}