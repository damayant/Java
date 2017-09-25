/*Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
*/
//MICROSOFT

import java.util.Scanner;


class BooleanStringValue
{
	public static int andA(int x, int y)
	{
		if (x == y) return x ;
		return 0;
	}
	public static int orB(int x,int y)
	{
		if(x == y) return x;
		return 1;
	}
	public static int xorC(int x,int y)
	{
		if (x==y) return 0 ;
		return 1;
	}
	public static void main(String[] args)
	{
		char operator = 'B';
		int x = 0;
		int y = 1;

		switch(operator)
		{
			case 'A':
				System.out.println(andA(x,y));
				break;
			case 'B':
				System.out.println(orB(x,y));
				break;
			case 'C':
				System.out.println(xorC(x,y));
				break;
		}
	}
}