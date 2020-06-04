package JavaInterview;

public class Practise_Interview {

	
	public static void main(String[] args)
	{
		int num = 15451;
		int t = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("reverse number is "+ rev);
		
		if(rev==t)
		{
			System.out.println("Given number is palindrome");	
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}
	
	/*public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void primeRange(int num)
	{
		for(int i=2; i<=num;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.print(i+ " ");
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(isPrimeNumber(7));
		primeRange(25);

	}*/

}
