package inOrderTraversalBinaryTree;

import java.util.ArrayList;
import java.util.Stack;

import ds_tree.TreeNode;

public class InOrderTraversalBinaryTreeIterative {

	public static void main(String[] args) {

		TreeNode node = new TreeNode(1);

		node.left = new TreeNode(2);
		node.right = new TreeNode(3);

		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);

		node.right.right = new TreeNode(7);
		node.right.left = new TreeNode(6);

		ArrayList<Integer> list = printInOderTraversal(node);

		for (int value : list) {
			System.out.println(value);
		}

	}

	// Left - Root - Right
	public static ArrayList<Integer> printInOderTraversal(TreeNode node) {

		Stack<TreeNode> stack = new Stack<>();

		ArrayList<Integer> list = new ArrayList<>();

		while (true) {

			if (node != null) {
				stack.push(node);
				node = node.left;
			}

			if (node == null) {
				// check if stack empty - only when iteration reaches to last node
				// i.e right most node.
				if (stack.isEmpty()) {
					break;
				} else {
					node = stack.pop(); // root Node of subtree present in stack
					list.add(node.val);
					node = node.right;
				}
			}

		}
		return list;
	}

}
