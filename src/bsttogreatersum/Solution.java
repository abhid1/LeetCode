package bsttogreatersum;

class Solution {
	
	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	private int count = 0;

	public TreeNode bstToGst(TreeNode root) {
		
		// Perform reverse in order traversal
		TreeNode current = root;

		if (current.right != null)
		{
			bstToGst(current.right);
		}

		count += current.val;

		current.val = count;

		if (current.left != null)
		{
			bstToGst(current.left);
		}

		return current;
	}
}
