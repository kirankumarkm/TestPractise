package JavaInterview;

import java.util.Scanner;

public class Sort_Numeric {

	public static void main(String[] args) {
		
		int temp,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Print the number of elements");
		n=s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter all the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}		
				
			}
		}
		
		//Sorted order
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
