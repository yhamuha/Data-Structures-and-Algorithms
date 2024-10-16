package lc.linkedlist.m;

import java.util.HashMap;
import java.util.Map;

class Node2 {
    public int key;
    public int val;
    public Node2 next;
    public Node2 prev;
    public Node2(int key, int val) {
        this.key = key;
        this.val = val;
        next = null;
        prev = null;
    }
}
public class LRUCache {
    private Map<Integer, Node2> m;
    private Node2 head;
    private Node2 tail;
    private int size;
    public LRUCache(int capacity) {
        size = capacity;
        m = new HashMap<>();
        head = new Node2(-1, -1);
        tail = new Node2(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    private void deleteNode(Node2 p) {
        Node2 pre = p.prev;
        Node2 nex = p.next;
        pre.next = nex;
        nex.prev = pre;
    }
    private void addNode(Node2 newnode) {
        Node2 temp = head.next;
        head.next = newnode;
        newnode.prev = head;
        newnode.next = temp;
        temp.prev = newnode;
    }
    // O(1) O(n)
    public int get(int key) {
        if (!m.containsKey(key))
            return -1;
        Node2 p = m.get(key);
        deleteNode(p);
        addNode(p);
        m.put(key, head.next);
        return head.next.val;
    }
    // O(1) O(n)
    public void put(int key, int value) {
        if (m.containsKey(key)) {
            Node2 c = m.get(key);
            deleteNode(c);
            c.val = value;
            addNode(c);
            m.put(key, head.next);
        } else {
            if (m.size() == size) {
                Node2 prev = tail.prev;
                deleteNode(prev);
                Node2 l = new Node2(key, value);
                addNode(l);
                m.remove(prev.key);
                m.put(key, head.next);
            } else {
                Node2 l = new Node2(key, value);
                addNode(l);
                m.put(key, head.next);
            }
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }
}
