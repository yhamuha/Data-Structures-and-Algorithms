package lc.bst.dfs.m.NestedListWeightSum;

import java.util.List;

class NestedIntegerImpl implements NestedInteger {
    private Integer value;
    private List<NestedInteger> list;
    public NestedIntegerImpl(Integer value) {
        this.value = value;
        this.list = null;
    }
    public NestedIntegerImpl(List<NestedInteger> list) {
        this.list = list;
        this.value = null;
    }
    public boolean isInteger() {
        return value != null;
    }
    public Integer getInteger() {
        return value;
    }
    public List<NestedInteger> getList() {
        return list;
    }
}
