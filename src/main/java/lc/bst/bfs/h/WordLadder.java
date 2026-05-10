package lc.bst.bfs.h;

import lc.bst.Pair;

import java.util.*;

public class WordLadder {
    // O(n * l) O(n * l) #amazon
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> setOfStrings = new HashSet<>(wordList);
        if (!setOfStrings.contains(endWord)) return 0;
        Queue<Pair<String, Integer>> queueOfPairs = new LinkedList<>();
        queueOfPairs.offer(new Pair<>(beginWord, 1));
        setOfStrings.remove(beginWord);
        while (!queueOfPairs.isEmpty()) {
            Pair<String, Integer> front = queueOfPairs.poll();
            String word = front.getKey();
            int steps = front.getValue();
            if (word.equals(endWord)) return steps;
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    arr[i] = c;
                    String next = new String(arr);
                    if (setOfStrings.contains(next)) {
                        setOfStrings.remove(next);
                        queueOfPairs.offer(new Pair<>(next, steps + 1));
                    }
                }
                arr[i] = original;
            }
        }
        return 0;
    }

    public static void main(String[] str) {
        WordLadder wl = new WordLadder();
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int length = wl.ladderLength(beginWord, endWord, wordList);
        System.out.println(length);
    }
}
