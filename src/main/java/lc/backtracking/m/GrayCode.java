package lc.backtracking.m;

import java.util.*;

public class GrayCode {
    // O(2^n * n) O(2^n)
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        if (generateGrayCode(0, n, result, visited)) {
            return result;
        }
        return result;
    }

    private boolean generateGrayCode(int num, int n, List<Integer> result, Set<Integer> visited) {
        if (result.size() == (1 << n)) return true;
        for (int i = 0; i < n; i++) {
            int next = num ^ (1 << i);

            if (!visited.contains(next)) {
                result.add(next);
                visited.add(next);

                if (generateGrayCode(next, n, result, visited)) return true;

                result.remove(result.size() - 1);
                visited.remove(next);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 2;
        GrayCode generator = new GrayCode();
        List<Integer> grayCodes = generator.grayCode(n);
        for (int code : grayCodes) {
            System.out.println(Integer.toBinaryString(code));
        }
    }
}
