/*Two strings are given. Modify 1st string such that all the common characters of the 2nd strings have to be removed and the uncommon characters of the 2nd string have to be concatenated with uncommon characters of the 1st string.*/
//Microsoft
import java.util.*;

class Uncommon
{
	
	public static String result(String s1, String s2)
	{
		boolean[] records = new boolean[256];
	   
	    for(char c: s2.toCharArray()){
	        records[c] = true;
	    }
	    StringBuilder sb = new StringBuilder();
	    for(char c: s1.toCharArray()){
	        if(records[c]) continue;
	        else
	        	sb.append(c);
	    }
	    Arrays.fill(records, false);
	    for(char c: s1.toCharArray()){
	        records[c] = true;
	    }
	    for(char c: s2.toCharArray()){
	        if(records[c]) continue;
	        else
	        	sb.append(c);
	    }
	   //  System.out.println(s1 + " " + s2);
	   if(sb.length() == 0) return "-1";
	    return sb.toString();
	}
	public static void main(String[] args)
	{
		String s = "xcd";
		String s2 = "cbd";
		System.out.println(result(s,s2));
	}


}