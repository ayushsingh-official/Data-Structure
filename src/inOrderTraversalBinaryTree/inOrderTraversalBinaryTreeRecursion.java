package inOrderTraversalBinaryTree;

import java.util.ArrayList;

import ds_tree.TreeNode;

public class inOrderTraversalBinaryTreeRecursion {

	public static void main(String[] args) {

		TreeNode node = new TreeNode(1);

		node.left = new TreeNode(2);
		node.right = new TreeNode(3);

		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);

		node.right.right = new TreeNode(7);
		node.right.left = new TreeNode(6);

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		printInOderTraversal(node);

//		for (int value : list) {
//			System.out.println(value);
//		}

	}

	private static void printInOderTraversal(TreeNode node)

	{

		if (node == null) {
			return;
		}

		printInOderTraversal(node.left);

		System.out.println((node.val + " "));

		printInOderTraversal(node.right);

		return;

	}

}
