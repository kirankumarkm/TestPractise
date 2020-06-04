package JavaInterview;

import java.util.regex.Pattern;

public class CheckIsNumeric {

	public static void main(String[] args)
	{
		String str = "544";
	      System.out.println("String: "+str);
	      if(Pattern.matches("[0-9]+",str) && str.length() > 2) {
	         System.out.println("String contains only digits!");
	      } else {
	         System.out.println("String contains digits charcters as well");
	      }

	}

}
