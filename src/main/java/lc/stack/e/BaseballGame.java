package lc.stack.e;

import java.util.Stack;

public class BaseballGame {
    // O(n) O(n)
    static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<operations.length; i++){
            if (operations[i].equals("C"))
                stack.pop();
            else if(operations[i].equals("D"))
                stack.push(2*stack.peek());
            else if(operations[i].equals("+") && stack.size()>=2){
                int x = stack.pop();
                int y = stack.pop();
                int z = x+y;
                stack.push(y);
                stack.push(x);
                stack.push(z);
            } else
                stack.push(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        while(!stack.isEmpty())
            sum+=stack.pop();
        return sum;
    }
    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(operations));
    }
}
