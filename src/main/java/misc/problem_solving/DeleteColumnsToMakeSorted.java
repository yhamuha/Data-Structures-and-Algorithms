package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] strs = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(strs));
    }

    static int minDeletionSize(String[] strs) {
    //column length
    int length = strs[0].length();
    //deleted count
    int deleted = 0;
    //for all columns
        for (int column = 0; column < length; column++) {
        //for all strings
        for (int i = 0; i < strs.length - 1; i++) {
            //if next current column char greater than next column char
            if (strs[i].charAt(column) > strs[i + 1].charAt(column)) {
                deleted++;
                break;
            }
        }
    }
        return deleted;
    }
}


