package lc.twopointer.m;

public class CircularArrayLoop {
    // O(n) O(n)
    public boolean circularArrayLoop(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                int slow = i;
                int fast = i;
                boolean isForward = nums[i] >= 0;
                while (true) {
                    slow = findNextIndex(nums, isForward, slow);
                    if (slow == -1)
                        break;
                    fast = findNextIndex(nums, isForward, fast);
                    if (fast == -1)
                        break;
                    fast = findNextIndex(nums, isForward, fast);
                    if (fast == -1)
                        break;
                    if (fast == slow)
                        return true;
                    visited[slow] = true;
                    visited[fast] = true;
                }
            }
        }
        return false;
    }
    int findNextIndex(int[] arr, boolean isForward, int curr) {
        boolean direction = arr[curr] >= 0;
        if (direction != isForward)
            return -1;
        int nextIndex = (arr[curr] + curr) % arr.length;
        if (nextIndex < 0)
            nextIndex += arr.length;
        if (nextIndex == curr)
            return -1;
        return nextIndex;
    }

    public static void main(String[] args) {
        CircularArrayLoop cal = new CircularArrayLoop();
        int[] nums = {-1, -2, -3, -4, -5, 6};
        boolean result = cal.circularArrayLoop(nums);
        System.out.println(result);
    }
}
