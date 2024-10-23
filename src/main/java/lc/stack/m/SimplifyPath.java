package lc.stack.m;

import java.util.Stack;

public class SimplifyPath {
    // O(n) O(n)
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] p = path.split("/");
        for (int i = 0; i < p.length; i++) {
            if (p[i].equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (!p[i].equals("") && !p[i].equals("."))
                stack.push(p[i]);
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty())
            res.insert(0, stack.pop()).insert(0, "/");
        if (res.length() == 0)
            return "/";
        else
            return res.toString();
    }

    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";
        String path5 = "/a/b/c/../../../..";
        System.out.println(sp.simplifyPath(path1));
        System.out.println(sp.simplifyPath(path2));
        System.out.println(sp.simplifyPath(path3));
        System.out.println(sp.simplifyPath(path4));
        System.out.println(sp.simplifyPath(path5));
    }
}
