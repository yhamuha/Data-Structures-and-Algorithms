package lc.dp.m;

public class DecodeWays {
    // TC: O(n^2)
    // Recursive + memoization
    char[] arr;
    Integer[] cache;
    // SC: O(n)
    public int numDecodings(String s) {
        this.arr = s.toCharArray();
        this.cache = new Integer[arr.length];
        return helper(0);
    }
    private int helper(int index){
        if(index == arr.length) return 1;
        if(cache[index] != null) return cache[index];
        int totalCodeWays = 0;
        StringBuilder str = new StringBuilder();
        for(int i=index; i<arr.length && i<index+2; i++){
            str.append(arr[i]);
            if(decodeCheck(str.toString())){
                totalCodeWays += helper(i+1);
            }
        }
        cache[index] = totalCodeWays;
        return totalCodeWays;
    }
    private boolean decodeCheck (String str){
        if(str.charAt(0)=='0') return false;
        Integer num = Integer.parseInt(str);
        return num < 27;
    }
    //O(n) O(n)
    // Dynamic
    /*public int numDecodings(String s) {
        char[] arr = s.toCharArray();
        int[] cache = new int[arr.length];
        int n = cache.length;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] == '0'){
                continue;
            }
            if(i == n - 1){
                cache[i] = 1;
                continue;
            }
            String str = s.substring(i, i + 2);
            if(Integer.parseInt(str) > 26){
                cache[i] = cache[i + 1];
            }else if(i == n - 2){
                cache[i] = cache[i + 1] + 1;
            }
            else{
                cache[i] = cache[i + 1] + cache[i + 2];
            }
        }
        return cache[0];
    }*/
    public static void main(String[] args) {
        var dw = new DecodeWays();
        String s = "226";
        System.out.println(dw.numDecodings(s));
    }
}
