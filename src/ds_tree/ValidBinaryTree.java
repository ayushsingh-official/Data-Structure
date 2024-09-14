package ds_tree;

import java.util.ArrayList;
import java.util.Stack;

public class ValidBinaryTree {

	public static void main(String[] args) {

		TreeNode node = new TreeNode(4);

		node.left = new TreeNode(2);
		node.right = new TreeNode(6);

		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(2);

		node.right.right = new TreeNode(7);
		node.right.left = new TreeNode(5);

//		ArrayList<Integer> list1 = new ArrayList<Integer>();

		System.out.println(checkValidBinaryTree(node));

//		for (int value : list) {
//			System.out.println(value);
//		}

	}

	// same as InOrder traversal
	private static boolean checkValidBinaryTree(TreeNode node) {

		Stack<TreeNode> stack = new Stack<>();

		ArrayList<Integer> list = new ArrayList<>();

		while (true) {

			// for every iteration - this is working
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
					node = stack.pop(); // parent node subNode present in stack

					// Addition if statement in InOrder traversal
					if (list.size() != 0 && node.val < list.get(list.size() - 1)) {
						return false;
					}
					list.add(node.val);
					node = node.right;
				}
			}
		}
		return true;
	}

}
