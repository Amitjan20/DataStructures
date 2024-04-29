//Using pre order traversal
public class KthSmallestElementBST {
    // Recursive function to insert a key into BST
    static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
 
        // If a node is inserted in left subtree, then lCount of
        // this node is increased. For simplicity, we are
        // assuming that all keys (tried to be inserted) are
        // distinct.
        if (x < root.data) {
            root.left = insert(root.left, x);
            root.lCount++;
        }
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
 
    // Preorder traversal of BST
    static void preorder(Node root, List<Integer> v) {
        if (root == null) return;
        v.add(root.data);
        preorder(root.left, v);
        preorder(root.right, v);
    }
 
    public static void main(String[] args) {
        Node root = null;
        int[] keys = { 20, 8, 22, 4, 12, 10, 14 };
        for (int x : keys)
            root = insert(root, x);
        int k = 4;
        List<Integer> v = new ArrayList<Integer>();
        preorder(root, v);
 
        // Sorting the given vector
        Collections.sort(v);
 
        // Finding kth smallest element
        System.out.println(v.get(k-1));
    }
}
