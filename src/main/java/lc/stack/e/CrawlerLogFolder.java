package lc.stack.e;

import java.util.Stack;

public class CrawlerLogFolder {
    // O(n) O(n)
    static int minOperations(String[] logs) {
        Stack<String> actions = new Stack<>();
        String current = "./";
        String back = "../";
        for(String action:logs) {
            if(!action.equals(current) && !action.equals(back)){
                actions.push(action);
            } else if (action.equals(back)){
                if(!actions.isEmpty())
                    actions.pop();
            }
        }
        return actions.size();
    }
    // O(n) O(1)
    static int minOperations_spaceOptimized(String[] logs) {
        int depth = 0;
        for (String log : logs){
            if (log.equals("./")) continue;
            else if (log.equals("../")){
                depth--;
                if (depth<0) depth =0;
            } else depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations_spaceOptimized(logs));
    }
}
