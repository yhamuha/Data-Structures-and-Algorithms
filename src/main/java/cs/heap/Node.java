package cs.heap;

public class Node {
    int key;
    int value;

    Node[] heap;
    int heapLastIndex = -1;

    boolean isEmpty() {
        return heapLastIndex == -1;
    }

    boolean isFull() {
        return heapLastIndex == heap.length -1;
    }

    void swap (int a, int b) {
        Node temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    boolean subTreeIsBalanced (int child, int parent) {
        return heap[child].key <= heap[parent].key;
    }

    int getLeftChildIndex(int parentIndex) {
        int leftChildIndex = 2 * parentIndex + 1;
        return leftChildIndex <= heapLastIndex ? leftChildIndex : -1;
    }

    int getRightChildIndex(int parentIndex) {
        int rightChildIndex = 2 * parentIndex + 2;
        return rightChildIndex <= heapLastIndex ? rightChildIndex : -1;
    }


    int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    int getLastParentIndex() {
        return getParentIndex(heapLastIndex);
    }

    boolean hasChildren (int nodeIndex) {
        return nodeIndex <= getLastParentIndex();
    }

    int getLargestChildIndex (int parentIndex) {
        int leftChildIndex = getLeftChildIndex(parentIndex);
        int rightChildIndex = getRightChildIndex(parentIndex);
        // make sure if we have a nodes
        if (leftChildIndex == -1 && rightChildIndex == -1) return -1;

        if (leftChildIndex == -1 || rightChildIndex == -1)
            return leftChildIndex !=1 ? leftChildIndex : rightChildIndex;

        // return largest left or right node
        if (heap[leftChildIndex].key > heap[rightChildIndex].key)
            if (!subTreeIsBalanced(rightChildIndex, parentIndex))
                return leftChildIndex;

        if(!subTreeIsBalanced(rightChildIndex, parentIndex))
            return rightChildIndex;

        return -1;
    }

    // bubble up node to level up
    void bubbleUpNode(int childIndex) {

    }

    // insert node
    void insert(Node node) {
        // isFull throw new Exception
        // put node to heap[lastIndex]
        // call bubbleUpNode()
    }

    // transform BT to Heap
    void heapify(int parentIndex) {

    }

    //
    Node extractRoot() throws Exception {
        if (isEmpty()) throw new Exception("Heap is empty");
        Node root = heap[0];
        heap[0] = heap[heapLastIndex];
        heapLastIndex-=1;

        heapify(0);
        return root;
    }


}
