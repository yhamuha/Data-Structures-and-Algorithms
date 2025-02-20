package lc.arraysandhashing.m;

public class SortColors {
    // O(n) O(1)
    public void sortColors(int[] nums) {
        int red=0, white=0, blue=0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 0)
                red++;
            else if (nums[i] == 1)
                white++;
            else
                blue++;
        }
        for(int i=0; i<nums.length; i++){
            if (red>0){
                nums[i] = 0;
                red--;
            }
            else if (white>0){
                nums[i] = 1;
                white--;
            }
            else {
                nums[i] = 2;
                blue--;
            }

        }

    }

    public static void main(String[] args) {
        SortColors sorter = new SortColors();
        int[] colors = {2,0,2,1,1,0};
        sorter.sortColors(colors);
        for (int color : colors)
            System.out.print(color + " ");
    }
}

