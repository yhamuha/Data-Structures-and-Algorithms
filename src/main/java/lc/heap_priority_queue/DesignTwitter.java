package lc.heap_priority_queue;

import java.util.*;

public class DesignTwitter {
    private Map<Integer, Set<Integer>> followers;
    private Map<Integer, PriorityQueue<int[]>> newsFeed;
    private Map<Integer, Set<int[]>> post;
    private Comparator<int[]> com;
    private int time;

    public DesignTwitter() {
        time = 0;
        followers = new HashMap<>();
        newsFeed = new HashMap<>();
        post = new HashMap<>();
        com = (a, b) -> b[1] - a[1];
    }
    // O (n * log n)
    public void postTweet(int userId, int tweetId) {
        int[] arr = new int[]{tweetId, time++};
        post.computeIfAbsent(userId, l -> new HashSet<>()).add(arr);
        newsFeed.computeIfAbsent(userId, pq -> new PriorityQueue<>(com)).add(arr);
        for(int follower : followers.getOrDefault(userId, new HashSet<>())){
            newsFeed.computeIfAbsent(follower, pq -> new PriorityQueue<>(com)).add(arr);
        }
    }
    // O (n log n)
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        List<int[]> list = new ArrayList<>();
        PriorityQueue<int[]> pq = newsFeed.getOrDefault(userId, new PriorityQueue<>(com));
        int i = 0;
        int[] arr;
        while(res.size() < 10 && !pq.isEmpty()){
            arr = pq.remove();
            res.add(arr[0]);
            list.add(arr);
        }
        pq.addAll(list);
        return res;
    }

    // O (n log n)
    public void follow(int followerId, int followeeId) {
        if(followers.computeIfAbsent(followeeId, s -> new HashSet<>()).add(followerId)){
            Set<int[]> set = post.getOrDefault(followeeId, new HashSet<>());
            newsFeed.computeIfAbsent(followerId, pq -> new PriorityQueue(com)).addAll(set);
        }
    }

    // O (n)
    public void unfollow(int followerId, int followeeId) {
        followers.getOrDefault(followeeId, new HashSet<>()).remove(followerId);
        Set<int[]> set = post.getOrDefault(followeeId, new HashSet<>());
        PriorityQueue<int[]> pq = newsFeed.getOrDefault(followerId, new PriorityQueue<>(com));
        pq.removeIf(e -> set.contains(e));
    }

    public static void main(String[] args) {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 5);
        List<Integer> newsFeed = twitter.getNewsFeed(1);
        System.out.println(newsFeed);
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        newsFeed = twitter.getNewsFeed(1);
        System.out.println(newsFeed);
        twitter.unfollow(1, 2);
        newsFeed = twitter.getNewsFeed(1);
        System.out.println(newsFeed);
    }
}
