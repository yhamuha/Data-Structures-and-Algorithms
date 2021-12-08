package misc.linkedList.mergelist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.val = 6;

        ListNode list2 = new ListNode();
        list2.val = 3;

        Solution solution = new Solution();

        System.out.println(Arrays.asList(solution.mergeTwoLists(list1, list2)));

    }
}
