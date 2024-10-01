package ds_tree;

public class KSmallestElement {

	public static void main(String[] args) {

		TreeNode node = new TreeNode(1);

		node.left = new TreeNode(2);
		node.right = new TreeNode(3);

		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);

		node.right.right = new TreeNode(7);
		node.right.left = new TreeNode(6);

		int pos = 0;

		int val = kthSmallestElementInABst(node, 4, pos);

		System.out.println(val);

	}

	public static int kthSmallestElementInABst(TreeNode root, int k, int pos) {

		TreeNode node = inOrderTraversal(k, root, pos);

		return node.val;

	}

	public static TreeNode inOrderTraversal(int k, TreeNode root, int pos) {

		if (root == null) {
			return root;
		}

		TreeNode left = inOrderTraversal(k, root.left, pos);
		if (left != null) {
			return left;
		}

		pos++;

		if (pos == k) {
			return root;
		}

		TreeNode right = inOrderTraversal(k, root.right, pos);
		return right;
	}

}
