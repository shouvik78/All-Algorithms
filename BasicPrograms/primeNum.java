<<<<<<< HEAD
package BasicPrograms;
import java.util.*;

public class primeNum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}

	}
	
}


=======
package BasicPrograms;
import java.util.*;

public class primeNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}

	}
	
}


>>>>>>> 99ce2e759736bf2519d65ffc105ce28a6c5cbeab
