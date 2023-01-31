package cs;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {5,9,1,7,4,6};
		//Before BubbleSort
		System.out.println("Before BubbleSort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nAfter BubbleSort");
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.print(arr[i]+" ");
		}

	}

}
