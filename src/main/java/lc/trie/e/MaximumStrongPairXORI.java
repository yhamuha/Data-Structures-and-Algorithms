package lc.trie.e;

public class MaximumStrongPairXORI {
    // identify pairs
    // get max XOR using two numbers from a pairs
    // XOR gives 1 only by 01 10
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            for (int y : nums) {
                if (Math.abs(x - y) <= Math.min(x, y)) {
                    ans = Math.max(ans, x ^ y);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var mspx = new MaximumStrongPairXORI();
        System.out.println(mspx.maximumStrongPairXor
                (new int[] {1,2,3,4,5}));
    }
}
