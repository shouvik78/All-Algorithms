//0 1 1 2 3 5 8 13...
/*package BasicPrograms;
import java.util.*;
public class fibonacciSimple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the upto you want the series");
		int count=sc.nextInt();
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}*/

//Using Recursion
package BasicPrograms;
public class fibonacciSimple {
	static int n1=0,n2=1,n3=0;
	static void fib(int n)
	{
		if(n>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fib(n-1);
		}
	}

	public static void main(String[] args) {
		int n=10;
		System.out.print(n1+" "+n2);
		fib(n-2);
	}

}
