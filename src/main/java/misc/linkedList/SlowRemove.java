package misc.linkedList;

public class SlowRemove {
    public static void main(String[] args) {

    }

    // slow remove i-th element from array
    int[] removeIthElement(int[] arr, int index) {
        if (arr.length == 0 || index >= arr.length || index < 0) return null;
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) result[i] = arr[i];
            else if (i > index) result[i - 1] = arr[i];
        }
        return result;
    }
}
