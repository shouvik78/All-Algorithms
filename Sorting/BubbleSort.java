package Sorting;
import java.util.*;
public class BubbleSort {
	
	static void bubbleSort(int arr[])
	{
		int n=arr.length;
		int j,i;
		for(i=0;i<n-1;i++)
			for(j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
				//swap
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
	}
	static void print(int arr[])
	{
		int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println();
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		print(arr);
	}

}
