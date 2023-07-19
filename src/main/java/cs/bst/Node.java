package cs.bst;

public class Node {
    Integer key = null;
    Integer value = null;
    Node left = null;
    Node right = null;

    static void createNode (Node node, int key, int value) {
        node.key = key;
        node.value = value;
        node.left = new Node();
        node.right = new Node();
    }

    static boolean nodeExist (Node node) {
        return node.key != null;
    }

    static void insert (Node node, int key, int value) {
        if (!nodeExist(node)) createNode(node, key, value);
        else if (key < node.key)
            insert (node.left, key, value);
        else
            insert (node.right, key, value);
    }

    // node : root
    static Node search (Node node, int key) {
        if (!nodeExist(node)) return null;
        if (node.key == key) return node;
        return (key < node.key)
                ? search(node.left, key)
                : search (node.right, key);
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void main(String[] args) {
        Node root = new Node();

        insert(root, 3, 12);
        insert(root, 1, 6);
        insert(root, 4, 33);

        System.out.println(" " + root.key);
        System.out.print(root.left.key); System.out.println(" " + root.right.key);

        System.out.println(search(root, 3));

    }
}

/*

Node    {key=3, value=12,   left=Node {key=1, value=6,
                                left=Node {key=null, value=null, left=null, right=null},
                                right=Node{key=null, value=null, left=null, right=null}},

                            right=Node{key=4, value=33,
                                left=Node{key=null, value=null, left=null, right=null},
                                right=Node{key=null, value=null, left=null, right=null}}}
*/
