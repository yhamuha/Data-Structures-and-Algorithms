package lc.bst.dfs.m.NestedListWeightSum;

import java.util.*;


public class NestedListWeightSum {
    // O(n) O(d) #meta
    public int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList, 1);
    }

    private int dfs(List<NestedInteger> nestedList, int depth) {
        int depthSum = 0;
        for (NestedInteger item : nestedList) {
            if (item.isInteger()) {
                depthSum += item.getInteger() * depth;
            } else {
                depthSum += dfs(item.getList(), depth + 1);
            }
        }
        return depthSum;
    }

    public static void main(String[] args) {
        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(new NestedIntegerImpl(1));
        List<NestedInteger> innerList = new ArrayList<>();
        innerList.add(new NestedIntegerImpl(4));
        List<NestedInteger> innerMostList = new ArrayList<>();
        innerMostList.add(new NestedIntegerImpl(6));
        innerList.add(new NestedIntegerImpl(innerMostList));
        nestedList.add(new NestedIntegerImpl(innerList));
        NestedListWeightSum nlws = new NestedListWeightSum();
        int result = nlws.depthSum(nestedList);
        System.out.println(result);
    }
}



