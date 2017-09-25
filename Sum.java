/*Given two non-negative numbers X and Y. The task is calculate the sum of X and Y.*/
/*For each test case, if the number of digits in sum (X+Y) are equal to the number of digits in X, then print sum, else print X.*/
//MICROSOFT

import java.lang.Math;

class Sum
{
	public static int sum(int x, int y)
	{
		int sum = x + y ;
		int l1 = (int)(Math.log10(x)+1);
		int l2 = (int)(Math.log10(sum)+1);
		if (l1==l2) return sum ;
		return x;

	}

	public static void main(String[] args)
	{
		System.out.println(sum(10,20));
		System.out.println(sum(90,10));
	}
}