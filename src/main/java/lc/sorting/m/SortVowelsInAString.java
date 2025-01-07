package lc.sorting.m;

public class SortVowelsInAString {
    public String sortVowels(String s) {
        // O(n) O(1)
        int[] vowelCount = new int[11];
        int[] countIndexMap = new int[128];
        char[] result = s.toCharArray();
        char[] charMap = "AEIOUaeiou".toCharArray();
        for (int i = 0; i < charMap.length; i++)
            countIndexMap[charMap[i]] = i + 1;
        for (char c : result)
            vowelCount[countIndexMap[c]]++;
        int j = 1;
        int i = 0;
        while (j < vowelCount.length) {
            if (vowelCount[j] > 0)
                while (i < result.length) {
                    if (countIndexMap[result[i]] == 0) {
                        i++;
                        continue;
                    }
                    vowelCount[j]--;
                    result[i++] = charMap[j - 1];
                    break;
                }
            else
                j++;
        }
        return new String(result);
    }

    public static void main(String[] args) {
        SortVowelsInAString sorter = new SortVowelsInAString();
        String input = "lEetcOde";
        System.out.println(sorter.sortVowels(input));
    }
}
