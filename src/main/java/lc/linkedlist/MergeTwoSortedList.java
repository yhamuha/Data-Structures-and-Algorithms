package lc.linkedlist;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class MergeTwoSortedList {
        // O(n+m) O(1)
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode root = new ListNode(), curr = root;
            ListNode index1 = list1, index2 = list2;

            while(index1 != null && index2 != null) {
                if(index1.val < index2.val) {
                    curr.next = index1; curr = curr.next; index1 = index1.next;
                } else {
                    curr.next = index2; curr = curr.next; index2 = index2.next;
                }
            }
            while(index1 != null) {
                curr.next = index1; curr = curr.next; index1 = index1.next;
            }
            while(index2 != null) {
                curr.next = index2; curr = curr.next; index2 = index2.next;
            }
            return root.next;
        }

        public static void main(String[] args) {
            ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
            ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

            MergeTwoSortedList merger = new MergeTwoSortedList();
            ListNode mergedList = merger.mergeTwoLists(list1, list2);

            System.out.print("Merged List: ");
            while (mergedList != null) {
                System.out.print(mergedList.val + " ");
                mergedList = mergedList.next;
            }
        }
}
