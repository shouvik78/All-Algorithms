package BasicPrograms;
import java.util.*;

public class primeNum1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number upto which you want prime number");
		int n=sc.nextInt();
		int i,j;
		for(i=2;i<=n;i++)
		{
			int c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
				System.out.print(+i+" ");
		}
		
	}

}
