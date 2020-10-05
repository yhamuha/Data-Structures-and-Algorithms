package misc.binary;

public class DoubleToBinary {


    static String printBinary(double num) {
        if (num>=1 || num <=0) return "error";
        String binary = ".";
        while (num > 0) {
            if (binary.length() > 23) return "error";
            double answerCandidate = num * 2;
            if (answerCandidate >=1) {
                binary += "1";
                num = answerCandidate - 1;
            } else {
                binary += "0";
                num = answerCandidate;
            }
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(printBinary(0.9));
    }
}
