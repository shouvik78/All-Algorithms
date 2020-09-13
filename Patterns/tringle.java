/*  *
 	**
 	***
 	****
 	*****  
*/

package Patterns;

public class tringle {

	public static void main(String[] args) {
		
		int n=5;
		//for rows
		for(int i=0;i<n;i++)
		{
			//for cols
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
