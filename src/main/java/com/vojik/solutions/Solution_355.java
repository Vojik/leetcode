package com.vojik.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/** 355. Design Twitter */
public class Solution_355 {

  private Map<Integer, Set<Integer>> followersMap = new HashMap<>();
  private Map<Integer, List<Post>> postsMap = new HashMap<>();
  private int postTime = 0;

  public Solution_355() {
  }

  public void postTweet(int userId, int tweetId) {
    postTime++;
    postsMap.putIfAbsent(userId, new LinkedList());
    List<Post> posts = postsMap.get(userId);
    if (posts.size() >= 10) {
      posts.remove(0);
    }
    posts.add(new Post(userId, tweetId, postTime));
    postsMap.put(userId, posts);

    checkFollowers(userId);
  }

  public List<Integer> getNewsFeed(int userId) {
    PriorityQueue<Post> pq = new PriorityQueue<>((a, b) -> a.time - b.time);
    checkFollowers(userId);
    Set<Integer> followers = followersMap.get(userId);
    for (int followerId : followers) {
      List<Post> posts = postsMap.get(followerId);
      if (posts != null) {
        for (Post p : posts) {
          pq.add(p);
          if (pq.size() > 10) {
            pq.poll();
          }
        }
      }
    }

    List<Integer> result = new LinkedList<>();
    while (!pq.isEmpty()) {
      result.add(0, pq.poll().tweetId);
    }
    return result;
  }

  public void follow(int followerId, int followeeId) {
    checkFollowers(followerId);
    checkFollowers(followeeId);
    Set<Integer> ids = followersMap.get(followerId);
    ids.add(followeeId);
    followersMap.put(followerId, ids);
  }

  public void unfollow(int followerId, int followeeId) {
    checkFollowers(followerId);
    checkFollowers(followeeId);
    Set<Integer> ids = followersMap.get(followerId);
    ids.remove(followeeId);
    followersMap.put(followerId, ids);
  }

  private void checkFollowers(int userId) {
    if (!followersMap.containsKey(userId)) {
      Set<Integer> users = new HashSet<>();
      users.add(userId);
      followersMap.put(userId, users);
    }
  }

  class Post {

    int userId;
    int tweetId;
    int time;

    Post(int userId, int tweetId, int time) {
      this.userId = userId;
      this.tweetId = tweetId;
      this.time = time;
    }
  }
}
