package JavaInterview;

public class FibonocciSeries {

	public static void main(String[] args) 
	{
		int num=7, x=0; int y=1, z=0;
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(x+" ");//0 1 
			z=x+y;//1
			x=y;//0
			y=z;//1
		
		}

	}

}
//0,1,1,2,3,5,8,13