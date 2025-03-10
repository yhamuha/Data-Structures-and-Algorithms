package lc.twopointer.m;

public class CompareVersionNumbers {
    // O(n+m) O(1)
    static int compareVersion(String version1, String version2) {
        int n = version1.length();
        int m = version2.length();
        int i = 0;
        int j = 0;
        while (i < n || j < m) {
            int num1 = 0;
            int num2 = 0;
            while (i < n && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while (j < m && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            if (num1 < num2)
                return -1;
            else if (num1 > num2)
                return 1;
            i++;
            j++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String version1 = "1.0.1";
        String version2 = "1";
        System.out.println(compareVersion(version1, version2));
    }
}
