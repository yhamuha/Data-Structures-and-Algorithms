package cs.dynamic;

import java.util.Stack;

public class FactorialEmulation {
   /* int factorial(int n) {
        SEG1-BEG if (n == 0) return 1;
        int nMinus1Fac SEG1-END = SEG2-BEG factorial(n - 1);
        return nMinus1Fac * n; SEG2-END
    }*/
}

class Frame {
    int nextCodeSegment;
    int n;
    int nMinus1Fac;
    Frame(int nextCodeSegment, int n) {
        this.nextCodeSegment = nextCodeSegment;
        this.n = n;
    }

    int factorial(int n) {
        int recResult = 0;
        Stack<Frame> stack = new Stack<>();
        stack.push(new Frame(0, n));
        while (stack.size() != 0) {
            Frame frame = stack.peek();
            switch (frame.nextCodeSegment) {
                case 0:
                    if (frame.n == 0) {
                        recResult = 1;
                        stack.pop();
                    } else {
                        frame.nextCodeSegment = 1;
                        stack.push(new Frame(0, frame.n - 1));
                    }
                    break;
                case 1:
                    frame.nMinus1Fac = recResult;
                    recResult = frame.nMinus1Fac * frame.n;
                    stack.pop();
                    break;
            }
        }
        return recResult;
    }
}
