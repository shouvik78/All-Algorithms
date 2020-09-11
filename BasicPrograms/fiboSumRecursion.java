<<<<<<< HEAD
//sum of fibo series
/*
package BasicPrograms;

public class fiboSumRecursion {
	static int fib(int n)
	{
		if(n<=1) return n;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		System.out.println(fib(n));
	}

}*/
package BasicPrograms;

public class fiboSumRecursion {
	private int x=0;
	public static void main(String args[])
	{
		new fiboSumRecursion().test();
	}
	private int f(int x)
	{
		return ++x;
	}
	private int g(int y)
	{
		return x++;
	
	}
	private void test()
	{
		System.out.print(f(x)==f(x)? "f":"#");
		System.out.print (g(x)==g(x)? "g":"#");
	}
}
=======
//sum of fibo series
/*
package BasicPrograms;

public class fiboSumRecursion {
	static int fib(int n)
	{
		if(n<=1) return n;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		System.out.println(fib(n));
	}

}*/
package BasicPrograms;

public class fiboSumRecursion {
	private int x=0;
	public static void main(String args[])
	{
		new fiboSumRecursion().test();
	}
	private int f(int x)
	{
		return ++x;
	}
	private int g(int y)
	{
		return x++;
	
	}
	private void test()
	{
		System.out.print(f(x)==f(x)? "f":"#");
		System.out.print (g(x)==g(x)? "g":"#");
	}
}
>>>>>>> 99ce2e759736bf2519d65ffc105ce28a6c5cbeab
