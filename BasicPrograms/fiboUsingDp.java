package BasicPrograms;

public class fiboUsingDp {
	
	static int fib(int n)
	{
		int stroage[]=new int[n+1];
		stroage[0]=0;
		stroage[1]=1;
		for(int i=2;i<=n;i++)
		{
			stroage[i]=stroage[i-1]+stroage[i-2];
		}
		return stroage[n];
	}

	public static void main(String[] args) 
	{
		int n=50;
		System.out.println(fib(n));

	}

}
