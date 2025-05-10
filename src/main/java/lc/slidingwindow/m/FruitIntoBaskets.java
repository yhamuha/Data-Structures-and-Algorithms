package lc.slidingwindow.m;

import java.util.HashMap;

public class FruitIntoBaskets {
    // O(n) O(n)
    static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap();
        int n = fruits.length;
        int right = 0;
        int maxFruits = Integer.MIN_VALUE;
        int left = 0;
        for (right = 0; right < n; right++) {
            if (map.containsKey(fruits[right])) {
                map.put(fruits[right], right);
            } else if (map.size() < 2) {
                map.put(fruits[right], right);
            } else {
                int min = Integer.MAX_VALUE;
                int minFruit = Integer.MAX_VALUE;
                for (int val : map.keySet()) {
                    if (min > map.get(val)) {
                        min = map.get(val);
                        minFruit = val;
                    }
                }
                left = min + 1;
                map.remove(minFruit);
                map.put(fruits[right], right);
            }
            int count = right - left + 1;
            maxFruits = Math.max(count, maxFruits);
        }
        return maxFruits;
    }

    public static void main(String[] args) {
        int[] fruits = {0,1,2,2};
        System.out.println(totalFruit(fruits));
    }
}
