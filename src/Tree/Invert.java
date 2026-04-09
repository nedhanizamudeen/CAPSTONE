package Tree;

public class Invert {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Invert Binary Tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursive calls
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    // In-order Traversal
    public void printInOrder(TreeNode root) {
        if (root == null) return;   // ✅ FIXED

        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        Invert obj = new Invert();

        // Create tree
        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);

        System.out.println("Original Tree (In-order):");
        obj.printInOrder(root);

        obj.invertTree(root);

        System.out.println("\nInverted Tree (In-order):");
        obj.printInOrder(root);
    }
}