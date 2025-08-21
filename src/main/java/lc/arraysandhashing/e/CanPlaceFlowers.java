package lc.arraysandhashing.e;

public class CanPlaceFlowers {
    // O(n) O(1)
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;
        while (i < len && n > 0) {
            if (flowerbed[i] == 1) i += 2;
            else if (i == len - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else i += 3;
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean canPlace = cpf.canPlaceFlowers(flowerbed, n);
        System.out.println(canPlace);
    }
}
