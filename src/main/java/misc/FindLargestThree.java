package misc;

import java.util.Arrays;

public class FindLargestThree {
    // T: O(n)
    // S: O(1)
    public static int[] findLargestThree(int arr[]) {
        if (arr.length < 3) {
            return new int[0];
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > first) {
                third = second;
                second = first;
                first = current;
            } else if (current > second) {
                third = second;
                second = current;
            } else if (current > third) {
                third = current;
            }
        }
        int[] res = new int[] {first,second,third};
        return res;
    }

    /* T: O(n)
       S: O(n)
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int num : arr) {
        pq.offer(num);
        if (pq.size() > 3) {
            pq.poll();
        }
    }

    int first = pq.poll();
    int second = pq.poll();
    int third = pq.poll();
    */


    public static void main(String[] args) {
        int arr[] = {19, 5, 78, 1, 33, 11, 20};
        System.out.println(Arrays.toString(findLargestThree(arr)));
    }
}