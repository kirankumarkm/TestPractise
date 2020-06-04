package JavaInterview;

public class PrimeNumber {

	//1. Logic to find the prime number(true/false)
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	//2. Logic to find the prime number in a range
	public static void primeRange(int num)
	{
		for (int i=2;i<=num;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.print(i +" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println(isPrimeNumber(5));
		primeRange(10);
		

	}

}
