package binarystringwithsubstrings;

public class Solution {

	public boolean queryString(String S, int N) {

		boolean isSubString = false;

		for (int num = 1; num <= N; num++)
		{

			String binaryString = Integer.toBinaryString(num);

			if (!S.contains(binaryString))
			{
				return false;
			}

		}

		return true;
	}
}
