package BasicPrograms;

import java.util.Scanner;

public class palindromNum {

	public static void main(String[] args) {
		int rem,sum=0,temp;
		System.out.println("Please enter a number");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			//System.out.println("Value of n "+n);
		}
		if(temp==sum)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}

	}

}
