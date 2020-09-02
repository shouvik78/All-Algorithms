package Searching;

public class LinearSearch {
	static int linearSearch(int arr[], int x)
	{
		int i;
		for(i=1;i<=arr.length;i++)
		{
			if(arr[i]==x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,34,3,6,7,8};
		int x=2;
		int res=linearSearch(arr,x);
		if(res==-1)
			System.out.println("Not found");
		else
			System.out.println(+res);
		
	}

}
