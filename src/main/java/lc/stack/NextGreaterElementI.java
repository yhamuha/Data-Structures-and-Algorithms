package lc.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    // TC: O(n), SC: O(n)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> next_greates = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(Integer num : nums2) {
            while (!stack.isEmpty() && stack.peek()<num) {
                next_greates.put(stack.pop(),num);
            }
            stack.push(num);
        }

        for(int i=0; i<nums1.length;i++) {
            nums1[i] = next_greates.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        NextGreaterElementI nge = new NextGreaterElementI();
        System.out.println(Arrays.toString(nge.nextGreaterElement(nums1, nums2)));
    }
}
