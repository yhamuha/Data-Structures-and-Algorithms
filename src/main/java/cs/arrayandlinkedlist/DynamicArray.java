package cs.arrayandlinkedlist;

public class DynamicArray {
    int capacity;
    int length;;
    int[] arr;

    public DynamicArray() {
        capacity = 2;
        length = 0;
        arr = new int[2];
    }

    public void pushback(int n) {
        if (length == capacity) {
            this.resize();
        }
        arr[length] = n;
        length++;
    }

    public void resize() {
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];

        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void popback() {
        if (length > 0) {
            length--;
        }
    }

    public int get(int i) {
        if (i < length) {
            return arr[i];
        }
        return -1;
    }

    public void insert(int i, int n) {
        int firstZeroElem = 0;
        if (i < length) {
            for (int p = i; p<arr.length; p++) {
                if (arr[p] == 0) {
                    firstZeroElem = p;
                }
            }
            for (int j = firstZeroElem; j>i; j--) {
                 arr[j] = arr[j-1];
            }
            arr[i] = n;

        }
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.pushback(1);
        dynamicArray.pushback(2);
        // resize
        dynamicArray.pushback(3);
        dynamicArray.insert(1,0);
        dynamicArray.print();
    }
}