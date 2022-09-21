package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n;
		
		//We will be excluding n from the array
		System.out.println("Please input a postive number, n.");
		n = scan.nextInt();
		
		int[] num; 
		num  = new int[n];
		
		int i = 0;
		int x = 2;
	
		while (i < n)
		{
		num[i] = i + x ;
		i++;
		}
		
		
		for (int d = 0; d < num.length; d++)
		{
			if (num[d] % 2 == 0)
			{
				num[d] = 0;
			}
		}
		
	System.out.println(num[4]);
		
		
		
	}

}
