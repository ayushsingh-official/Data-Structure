package postOderTraversalBinaryTree;

import java.util.ArrayList;
import java.util.Stack;

import ds_tree.TreeNode;

public class PostOrderTraversalIterative {

	public static void main(String[] args) {

		TreeNode node = new TreeNode(1);

		node.left = new TreeNode(2);
		node.right = new TreeNode(3);

		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);

		node.right.right = new TreeNode(7);
		node.right.left = new TreeNode(6);

		ArrayList<Integer> list =

				printPostOrderTraversal(node);

		for (int value : list) {
			System.out.println(value);
		}

	}

	private static ArrayList<Integer> printPostOrderTraversal(TreeNode node) {

		Stack<TreeNode> stack = new Stack<>();

		ArrayList<Integer> list = new ArrayList<Integer>();

		stack.push(node);

		while (true) {

			if (!stack.empty()) {
				node = stack.pop();
				list.add(0, node.val);
			} else {
				break;
			}

			if (node.left != null) {
				stack.push(node.left);
			}
			if (node.right != null) {
				stack.push(node.right);
			}

		}
		return list;
	}

}
