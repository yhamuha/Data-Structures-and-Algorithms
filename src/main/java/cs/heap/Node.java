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

    int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    int getLastParentIndex() {
        return getParentIndex(heapLastIndex);
    }

    boolean hasChildren (int nodeIndex) {
        return nodeIndex <= getLastParentIndex();
    }
}
