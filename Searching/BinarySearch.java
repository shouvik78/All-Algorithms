package Searching;

public class BinarySearch {
	
	static int search(int arr[],int x)
	{
		int start=0; 
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+(end-1))/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]<x)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,11,14};
        int n = arr.length; 
		int x=12;
		int res=search(arr,x);
		if(res==-1)
			System.out.println("not found");
		else
			System.out.println(+res);
		
	}

}
