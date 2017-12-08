//Remove the vowels from string
//GE

import java.util.* ;
import java.lang.*;
class RemoveVowels
{
	public static void remove(String s)
	{
		HashMap<Integer,Character> record = new HashMap<>();
		String s2 = "aeuio";

		for(char c:s2.toCharArray()) //putting each charecter of String s2 in hashmap 
		{
			System.out.println(c);
			if(record.containsValue(c) == false)
				record.put(((int)c),c) ;
				
			
		}
	
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
		
			if (record.containsValue(c))
			{
				String s3 = Character.toString(c);
				s = s.replace(s3,"");
			}
		}
		System.out.println(s); 
	}


	public static void main(String[] args)
	{
		String s = "welcome to geeksforgeeks";
		remove(s);
	}
}
