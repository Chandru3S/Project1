package cs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecHighNo {

	public static void main(String[] args) {

		int arr[]= {3,6,9,2,7,5,1,4};

		System.out.println("Array values: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\nSecondLargestNumberInAnArray: ");
		int temp, n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}	
		}
		System.out.print(arr[n-2]+" ");
		
		System.out.println("\n\nSecondLargestNumber Squre: ");
		
		System.out.print(arr[n-2]*arr[n-2]+" ");
		
		
		
		
	}

}
