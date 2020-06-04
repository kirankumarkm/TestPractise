package JavaInterview;

public class ArmsrongNumber {

	
	public static void isArmstronNumber(int num)
	{
		System.out.println("Given number is "+ num);
		int cube=0;
		int r;
		int t;
		t=num;
		
		while(num>0)
		{
			r= num%10;
			num=num/10;
			cube = cube+(r*r*r);
			
		}
			if(t ==cube)
			{
				System.out.println("Given number is Armstrong number");
			}
			else
			{
				System.out.println("Give number is not Armstrong number");
			}
			
	}
	
	public static void main(String[] args) 
	{
		isArmstronNumber(153);

	}

}
