package JavaInterview;

public class ArrySplit {

	public static void main(String[] args)
	{
		String s1="alpha";
		String s2=concat(s1);
		System.out.print(s2);

	}
	
	public static String concat(String s1)
	{
		String first="";
		String second="";
		int mid=(s1.length()-1)/2;
		
		for(int i=mid;i>=0;i--)
		{
			first = first+s1.charAt(i);
		}
		for(int i=s1.length()-1;i>mid;i--)
		{
			second=second+s1.charAt(i);
		}
		String s3=first+" "+second;
		return s3;
	}

}
