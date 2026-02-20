package lc.slidingwindow.m;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    // O(n^3) O(n)
    /*static int fruitIntoBaskets(int[] fruits) {
        int maxLength = 0;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i; j < fruits.length; j++) {
                Set<Integer> distinct = new HashSet<>();
                for (int k = i; k <= j; k++)
                    distinct.add(fruits[k]);
                if (distinct.size() <= 2) {
                    maxLength = Math.max(maxLength, j - i + 1);
                } else {
                    break;
                }
            }
        }

        return maxLength;
    }*/

    // O(n) O(1)
    /*static int totalFruit(int[] fruits) {
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
    }*/

    // O(n) O(1)
    static int totalFruit(int[] fruits) {
        int start = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        int maxFruit = 0;
        for (int end = 0; end < fruits.length; end++) {
            basket.put(fruits[end], basket.getOrDefault(fruits[end], 0) + 1);
            while (basket.size() > 2) {
                basket.put(fruits[start], basket.get(fruits[start]) - 1);
                if (basket.get(fruits[start]) == 0) {
                    basket.remove(fruits[start]);
                }
                start++;
            }
            maxFruit = Math.max(maxFruit, end - start + 1);
        }
        return maxFruit;
    }

    public static void main(String[] args) {
        int[] fruits = {3, 3, 2, 1, 2, 1, 0};
        System.out.println(totalFruit(fruits));
    }
}
