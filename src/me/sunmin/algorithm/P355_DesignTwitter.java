package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
//https://leetcode.com/problems/design-twitter/
//Runtime: 68 ms, faster than 96.89% of Java online submissions for Design Twitter.

public class P355_DesignTwitter {
	/** Initialize your data structure here. */
    public P355_DesignTwitter() {
    	
    }
	
    private class Tweet implements Comparable {
    	int tweetId;
    	int timeId;
    	
    	Tweet(int _tweetId, int _timeId) {
    		tweetId = _tweetId;
    		timeId = _timeId;
    	}

		@Override
		public int compareTo(Object o) {
			Tweet t2 = (Tweet)o;
			return t2.timeId - timeId;
		}
    }
    
	Map<Integer, Set<Integer>>followers = new HashMap<Integer, Set<Integer>>();
	Map<Integer, List<Tweet>>posts = new HashMap<Integer, List<Tweet>>();
	static int timeId = 0;
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        List<Tweet> s = posts.get(userId);
        if (s == null) {
        	s = new ArrayList<Tweet>();
        	posts.put(userId, s);
        }
        s.add(0, new Tweet(tweetId, timeId++));
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
    	List<Tweet> l = new ArrayList<>();
    	l.addAll(posts.getOrDefault(userId, new ArrayList<Tweet>()));
        Set<Integer> s = followers.get(userId);
        if (s != null) {
        	for (int uId : s) {
        		List<Tweet> ls = posts.get(uId);
        		if (ls != null) {
        			l.addAll(ls);
        		}
        	}
        }
    	
    	Collections.sort(l);
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < l.size() && i < 10; i++) {
        	Tweet t = l.get(i);
        	ll.add(t.tweetId);
        }
        return ll;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
    	if (followerId == followeeId) return;
        Set<Integer> s = followers.get(followerId);
        if (s == null) {
        	s = new HashSet<Integer>();
        	followers.put(followerId, s);
        }
        s.add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
    	if (followerId == followeeId) return;
    	Set<Integer> s = followers.get(followerId);
        if (s == null) {
        	s = new HashSet<Integer>();
        }
        s.remove(followeeId);
    }
}
