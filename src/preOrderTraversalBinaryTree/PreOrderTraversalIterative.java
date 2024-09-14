package preOrderTraversalBinaryTree;

import java.util.ArrayList;
import java.util.Stack;

import ds_tree.TreeNode;

public class PreOrderTraversalIterative {

	public static void main(String[] args) {

		TreeNode node = new TreeNode(1);

		node.left = new TreeNode(2);
		node.right = new TreeNode(3);

		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);

		node.right.right = new TreeNode(7);
		node.right.left = new TreeNode(6);

		ArrayList<Integer> list = PreOrderTraversal(node);

		for (int value : list) {
			System.out.println(value);
		}

	}

	private static ArrayList<Integer> PreOrderTraversal(TreeNode node) { 

		Stack<TreeNode> stack = new Stack<>();

		ArrayList<Integer> list = new ArrayList<>();
		stack.push(node);

		// logic 1
		// when you not able to find the while loop condition - when to break.
		while (true) {

			// stack will be empty at last only
			if (!stack.empty()) {
				node = stack.pop();
				list.add(node.val);
			} else {
				break;
			}

			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}

		}

		// logic 2.
//		while (!stack.isEmpty()) {
//
//			// stack will be empty at last only
//
//			node = stack.pop();
//			list.add(node.val);
//
//			if (node.right != null) {
//				stack.push(node.right);
//			}
//			if (node.left != null) {
//				stack.push(node.left);
//			}
//
//		}

		return list;
	}

}
