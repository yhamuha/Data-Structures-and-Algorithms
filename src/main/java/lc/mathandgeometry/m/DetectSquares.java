package lc.mathandgeometry.m;

import java.util.HashMap;
import java.util.Map;

public class DetectSquares {
    // O(n^2) O(n)
    HashMap<Integer, HashMap<Integer, Integer>> mXmap;
    int count;
    public DetectSquares() {
        mXmap = new HashMap<>();
        count = 0;
    }
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        if(!mXmap.containsKey(x))
            mXmap.put(x, new HashMap<Integer, Integer>());
        mXmap.get(x).put(y, mXmap.get(x).getOrDefault(y,0)+1);
        count++;
    }
    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int res = 0;
        if(count < 3)
            return 0;
        for(Map.Entry<Integer, HashMap<Integer, Integer>> entry : mXmap.entrySet()){
            if(entry.getKey() != x){
                int xc = entry.getKey();
                for(Map.Entry<Integer, Integer> yentry : entry.getValue().entrySet()) {
                    int yc = yentry.getKey();
                    int num = isValidSquare(x,y,xc,yc);
                    if(num != 0){
                        res += yentry.getValue()*num;
                    }
                }
            }
        }
        return res;
    }
    public int isValidSquare(int x1, int y1, int x2, int y2) {
        if(Math.abs(y1-y2) != Math.abs(x1-x2))
            return 0;
        if(mXmap.containsKey(x1) && mXmap.get(x1).containsKey(y2)
                && mXmap.containsKey(x2) && mXmap.get(x2).containsKey(y1)) {
            int res = mXmap.get(x1).get(y2) * mXmap.get(x2).get(y1);
            return res;
        }
        return 0;
    }

    public static void main(String[] args) {
        DetectSquares detector = new DetectSquares();
        int[] point1 = {3, 10};
        int[] point2 = {11, 2};
        int[] point3 = {3, 2};
        int[] point4 = {11, 10};
        int[] point5 = {14, 8};
        int[] point6 = {11, 2};
        int[] point7 = {11, 10};
        detector.add(point1);
        detector.add(point2);
        detector.add(point3);
        System.out.println(detector.count(point4));
        System.out.println(detector.count(point5));
        detector.add(point6);
        System.out.println(detector.count(point7));
    }
}
