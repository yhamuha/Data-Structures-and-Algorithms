package lc.stack.e;

import java.util.Stack;

public class CrawlerLogFolder {
    // O(n) O(n)
    public int minOperations(String[] logs) {
        Stack<String> actions = new Stack<>();
        String current = "./";
        String back = "../";
        for(String action:logs) {
            if(!action.equals(current) && !action.equals(back)){
                actions.push(action);
            } else if (action.equals(back)){
                if(!actions.isEmpty()) {
                    actions.pop();
                }
            }
        }
        return actions.size();
    }

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        CrawlerLogFolder clf = new CrawlerLogFolder();
        System.out.println(clf.minOperations(logs));
    }
}
