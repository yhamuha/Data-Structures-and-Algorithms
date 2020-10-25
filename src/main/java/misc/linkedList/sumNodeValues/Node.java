package misc.linkedList.sumNodeValues;

public class Node {
        Node next;
        int digit;

        Node(int digit){
            this.digit = digit;
        }

    Node addLists(Node l1, Node l2) {

        // init head and tail, carry
        Node resultHead = null, resultTail = null;
        int carry = 0;

        // parallel sum of two linked list and move to the next nodes
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) { sum += l1.digit; l1 = l1.next; }
            if (l2 != null) { sum += l2.digit; l2 = l2.next; }

            // save to digit
            Node currentDigit = new Node(sum % 10);
            // save to carry
            carry = sum > 9 ? 1 : 0;

            if (resultHead == null) {
                resultHead = currentDigit;
                resultTail = currentDigit;
            } else {
                resultTail.next = currentDigit;
                resultTail = currentDigit;
            }
        }

        if (carry == 1) resultTail.next = new Node(carry);
        return resultHead;
    }

}
