package lc.stack.m;

import java.util.Stack;

public class SimplifyPath {
    // O(n) O(n)
    static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] p = path.split("/");
        for (int i = 0; i < p.length; i++) {
            if (p[i].equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (!p[i].equals("") && !p[i].equals("."))
                stack.push(p[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.insert(0, stack.pop()).insert(0, "/");
        if (sb.length() == 0)
            return "/";
        else
            return sb.toString();
    }

    public static void main(String[] args) {
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";
        String path5 = "/a/b/c/../../../..";
        System.out.println(simplifyPath(path1));
        System.out.println(simplifyPath(path2));
        System.out.println(simplifyPath(path3));
        System.out.println(simplifyPath(path4));
        System.out.println(simplifyPath(path5));
    }
}
