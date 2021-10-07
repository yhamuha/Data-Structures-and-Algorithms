package misc.problem_solving;

/**
 *
 */
public class GenerateOddNumberOfNChars {
    public static void main(String[] args) {
     int n = 5;
        System.out.println(generateTheString(n));
    }

    //
    static String generateTheString(int n) {
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i]='a';
        }
        if(n%2 ==0){
            arr[0] = 'b';
        }

        return new String(arr);
    }
}
