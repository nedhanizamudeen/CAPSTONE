package Tree;

import java.util.*;

public class Vertical {

    // Tree Node
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Pair class (node + column)
    static class Pair {
        TreeNode node;
        int col;

        Pair(TreeNode node, int col) {
            this.node = node;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            TreeNode node = p.node;
            int col = p.col;

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(node.val);

            if (node.left != null)
                queue.offer(new Pair(node.left, col - 1));

            if (node.right != null)
                queue.offer(new Pair(node.right, col + 1));
        }

        res.addAll(map.values());
        return res;
    }

    // MAIN METHOD (IMPORTANT)
    public static void main(String[] args) {
        Vertical obj = new Vertical();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        List<List<Integer>> result = obj.verticalOrder(root);

        System.out.println(result);
    }
}