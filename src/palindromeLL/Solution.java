package palindromeLL;

import java.util.ArrayList;

public class Solution {
	
	// Definition for singly-linked list.
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

	public boolean isPalindrome(ListNode head) {

		ListNode current = head;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (current != null)
		{
			list.add(current.val);
			current = current.next;
		}

		return stringReverse(list);

	}

	public boolean stringReverse(ArrayList<Integer> list)
	{
		ArrayList<Integer> retList = new ArrayList<Integer>();

		for (int i = list.size() - 1; i >= 0; i--)
		{
			retList.add(list.get(i));
		}

		if (retList.equals(list))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
