package lc.slidingwindow.m;

import java.util.HashMap;

public class FruitIntoBaskets {
    // O(n) O(n)
    static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap();
        int n = fruits.length;
        int rpointer=0;
        int maxFruits=Integer.MIN_VALUE;
        int lpointer=0;
        for(rpointer=0;rpointer<n;rpointer++) {
            if(map.containsKey(fruits[rpointer])) {
                map.put(fruits[rpointer],rpointer);}
            else if(map.size()<2) {
            map.put(fruits[rpointer],rpointer);
        } else {
                int min = Integer.MAX_VALUE;
                int minFruit = Integer.MAX_VALUE;
                for(int val:map.keySet()) {
                    if(min>map.get(val)) {
                        min=map.get(val);
                        minFruit = val;
                    }
                }
                lpointer=min+1;
                map.remove(minFruit);
                map.put(fruits[rpointer],rpointer);
            }
            int count =rpointer-lpointer+1;
            maxFruits =Math.max(count,maxFruits);
        }
        return maxFruits;
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruit(fruits));
    }
}
