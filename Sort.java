package javaPack;

import java.util.Scanner;

public class Sort 
{
	Scanner allinput = new Scanner(System.in);
	
	public void AcceptInfo()
	{
		System.out.print("How many numbers will you enter: ");
		int num = allinput.nextInt();
		int[] arr = new int [num];
		
		for(int i = 0; i < num; i++)
		{
			System.out.print("Enter a number: ");
			arr[i]= allinput.nextInt();
		}
		organize(arr);
	}
	
	public void organize(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for(int n=0; n<arr.length; n++)
		{
			System.out.print(arr[n] + " ");
		}
	}
}
