package JavaInterview;

public class Converting_Upp_to_Lower_and_Low_to_Upper {

	public static void main(String[] args) 
	{
		String str1="Kiran Kumar";
		String str2="";
		char c;
		for(int i=0; i<str1.length(); i++)
		{
			c=str1.charAt(i);
			if(Character.isUpperCase(c))
			{
				str2 = str2+Character.toLowerCase(c);
			}
			else
			{
				str2 = str2+Character.toUpperCase(c);
			}
			
		}
		System.out.println(str2);

	}

}
