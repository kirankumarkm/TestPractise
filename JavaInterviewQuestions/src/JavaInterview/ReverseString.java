package JavaInterview;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		/*String str = "kiran kumar";
		char chars[] = str.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--)
		{
			System.out.print(chars[i]);
		}*/
		
		Scanner s2= new Scanner(System.in);
		int size=s2.nextInt();
		int a1[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++)
		{
			a1[i]=s2.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a1[i]);
		}
	}

}
 