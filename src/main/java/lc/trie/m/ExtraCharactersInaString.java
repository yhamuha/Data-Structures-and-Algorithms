package lc.trie.m;

import java.util.HashMap;

class Trie{
    int val=0;
    Trie[] next = new Trie[26];
}
class ExtraCharactersInaString {
    HashMap<String,Integer> h = new HashMap<>();

    int ch(String s,int i,int d,Trie r,Trie c){
        if(i==s.length())return ((c.val==1)?0:d);
        String y = "";
        y+=i+"-"+c;
        if(h.get(y)!=null)return h.get(y);
        int a=0;
        if(r!=c && r.next[s.charAt(i)-'a']!=null && c.next[s.charAt(i)-'a']!=null){
            a= Math.min(ch(s,i+1,1,r,r.next[s.charAt(i)-'a'])+((c.val==1)?0:d),
                        ch(s,i+1,d+((c.val==1)?0:1),r,c.next[s.charAt(i)-'a']));
        }
        else if(c.next[s.charAt(i)-'a']!=null)
            a= ch(s,i+1,d+((c.val==1)?0:1),r,c.next[s.charAt(i)-'a']);
        else if(r.next[s.charAt(i)-'a']!=null){
            a= ((c.val==1)?0:d) + ch(s,i+1,1,r,r.next[s.charAt(i)-'a']);
        }
        else a= ((c.val==1)?0:d) + 1 + ch(s,i+1,0,r,r);
        h.put(y,a);
        return a;
    }
    public int minExtraChar(String s, String[] dictionary) {
        Trie p = new Trie();
        for(String d:dictionary){
            Trie r = p;
            for(char c:d.toCharArray()){
                if(r.next[c-'a']==null)r.next[c-'a']=new Trie();
                r=r.next[c-'a'];
            }
            r.val=1;
        }
        return ch(s,0,0,p,p);
    }

    public static void main(String[] args) {
        var ecs = new ExtraCharactersInaString();
        String s = "leetscode";
        String[] dict = {"leet","code","leetcode"};
        System.out.println(ecs.minExtraChar(s, dict));
    }
}
