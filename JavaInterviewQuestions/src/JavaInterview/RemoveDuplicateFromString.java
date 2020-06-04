package JavaInterview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	
	
	public static void main(String[] args) 
	{
		String str = "koodli";
		System.out.println(removeDuplicate(str));

	}
	
	public static String removeDuplicate(String str)
	{
		
		Set <Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			Character c = str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sb.append(c);
			}
		}
		
		return sb.toString();
	}

}
